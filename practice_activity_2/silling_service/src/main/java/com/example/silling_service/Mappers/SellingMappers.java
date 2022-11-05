package com.example.silling_service.Mappers;

import com.example.silling_service.Dtos.SellingRequestDto;
import com.example.silling_service.Dtos.SellingResponseDto;
import com.example.silling_service.entities.Customer;
import com.example.silling_service.entities.Selling;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class SellingMappers {

   public SellingResponseDto fromSelling(Selling selling){
        SellingResponseDto sellingResponseDto=new SellingResponseDto();
        BeanUtils.copyProperties(selling,sellingResponseDto);
        Customer customer=selling.getCustomer();
        if(customer!=null)
            sellingResponseDto.setCustomer(customer);
        return sellingResponseDto;
    }
}
