package com.example.silling_service.Services;

import com.example.silling_service.Dtos.ProductResponseDto;
import com.example.silling_service.Dtos.SellingRequestDto;
import com.example.silling_service.Dtos.SellingResponseDto;
import com.example.silling_service.Mappers.ProductMappers;
import com.example.silling_service.Mappers.SellingMappers;
import com.example.silling_service.OpenFeignServices.CustomerOpenFeignService;
import com.example.silling_service.OpenFeignServices.ProductOpenFeignClient;
import com.example.silling_service.Repositories.ProductItemRepository;
import com.example.silling_service.Repositories.SellingRepository;
import com.example.silling_service.Types.ProdWithQte;
import com.example.silling_service.entities.Customer;
import com.example.silling_service.entities.Product;
import com.example.silling_service.entities.Selling;
import lombok.AllArgsConstructor;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class SellingServiceImpl implements SellingService {
    private SellingMappers sellingMappers;
    private SellingRepository sellingRepository;
    private CustomerOpenFeignService customerOpenFeignService;
    private ProductOpenFeignClient productOpenFeignClient;
    private ProductItemRepository productItemRepository;
    private ProductMappers productMappers;
    @Override
    public SellingResponseDto saveSelling(SellingRequestDto sellingRequestDto) {
        List<Product> productList=new ArrayList<>();
        double total=0;
        Selling selling=new Selling();
        selling.setId(UUID.randomUUID().toString());
        selling.setDate(new Date());
        Customer customer=customerOpenFeignService.getCustomerId(sellingRequestDto.getIdCustomer());
        selling.setCustomer(customer);
        selling.setIdCustomer(customer.getId());
        for (int i = 0; i < sellingRequestDto.getProdWithQtes().size(); i++) {
            ProdWithQte prodWithQte=sellingRequestDto.getProdWithQtes().get(i);
            Product product=productOpenFeignClient.getProductById(prodWithQte.getId());
            if(product.getQteStock()>prodWithQte.getQteCmd()){
                product.setQteCmd(prodWithQte.getQteCmd());
                productList.add(product);
                total+=product.getPrice()* prodWithQte.getQteCmd();
            }
            else {
                throw new RuntimeException();
            }
        }
        selling.setTotalHT(total);
        Selling savedSelling=sellingRepository.save(selling);
        for (Product p:productList) {
            p.setSelling(savedSelling);
            productItemRepository.save(p);
        }
        return sellingMappers.fromSelling(selling);
    }

    @Override
    public SellingResponseDto getSellingById(String id) {
        return sellingMappers.fromSelling(sellingRepository.findById(id).orElseThrow(()->new RuntimeException("Selling not found exception")));
    }

    @Override
    public List<SellingResponseDto> getAllSelling() {
        return sellingRepository.findAll().
                stream().map(selling ->{
                    Customer customer=customerOpenFeignService.getCustomerId(selling.getIdCustomer());
                    SellingResponseDto sellingResponseDto=sellingMappers.fromSelling(selling);
                    sellingResponseDto.setCustomer(customer);
                    return sellingResponseDto;
                }).collect(Collectors.toList());
    }

    @Override
    public void DeleteSelling(String id) {
        sellingRepository.deleteById(id);
    }

    @Override
    public List<ProductResponseDto> getProductsInvoice(String idInvoice) {
       Selling selling=sellingRepository.findById(idInvoice).orElse(null);
       List<Product> productList=selling.getProducts();
       return productList.stream().map(product -> productMappers.fromProduct(product)).collect(Collectors.toList());
    }
}
