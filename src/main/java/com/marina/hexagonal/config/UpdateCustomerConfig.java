package com.marina.hexagonal.config;

import com.marina.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.marina.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.marina.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.marina.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.marina.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
        FindCustomerByIdUseCase findCustomerByIdUseCase,
        FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
        UpdateCustomerAdapter updateCustomerAdapter
    ){
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter,updateCustomerAdapter);
    }
}
