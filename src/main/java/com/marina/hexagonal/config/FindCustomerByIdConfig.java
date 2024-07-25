package com.marina.hexagonal.config;

import com.marina.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.marina.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {
    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
        FindCustomerByIdAdapter findAddressByZipCodeAdapter
    ){
        return new FindCustomerByIdUseCase(findAddressByZipCodeAdapter);
    }
}
