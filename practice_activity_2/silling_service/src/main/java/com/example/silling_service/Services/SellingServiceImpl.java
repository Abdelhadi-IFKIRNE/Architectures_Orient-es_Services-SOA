package com.example.silling_service.Services;

import com.example.silling_service.Dtos.SellingRequestDto;
import com.example.silling_service.Dtos.SellingResponseDto;
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
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Service
public class SellingServiceImpl implements SellingService {
    private SellingMappers sellingMappers;
    private SellingRepository sellingRepository;
    private CustomerOpenFeignService customerOpenFeignService;
    private ProductOpenFeignClient productOpenFeignClient;
    private ProductItemRepository productItemRepository;
    @Override
    public SellingResponseDto saveSelling(SellingRequestDto sellingRequestDto) {
        Selling selling=new Selling();
        selling.setId(UUID.randomUUID().toString());
        selling.setDate(new Date());
        Customer customer=customerOpenFeignService.getCustomerId(sellingRequestDto.getIdCustomer());
        selling.setCustomer(customer);
        for (int i = 0; i < sellingRequestDto.getProdWithQtes().size(); i++) {
            ProdWithQte prodWithQte=sellingRequestDto.getProdWithQtes().get(i);
            Product product=productOpenFeignClient.getProductById(prodWithQte.getId());
            if(product.getQteStock()<prodWithQte.getQteCmd())
                new RuntimeException("Qte commandee est supérieur à la Qte en stock");
            else {
                selling.setTotalHT(selling.getTotalHT()+ prodWithQte.getQteCmd()* product.getPrice());

            }
        }
        return new SellingResponseDto();
    }

    @Override
    public SellingResponseDto getSellingById(String id) {
        return null;
    }

    @Override
    public List<SellingResponseDto> getAllSelling() {
        return null;
    }

    @Override
    public void DeleteSelling(String id) {

    }

    @Override
    public List<Product> getProductsInvoice(String idInvoice) {
        return null;
    }
}
