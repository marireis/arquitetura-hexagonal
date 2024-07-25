package com.marina.hexagonal.config;

import com.marina.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.marina.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.marina.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.marina.hexagonal.application.core.usecase.DeleteCustomerUseCase;
import com.marina.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.marina.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import com.marina.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.marina.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerUseCase deleteCustomerUseCase(
        FindCustomerByIdUseCase findCustomerByIdUseCase,
        DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
        return new DeleteCustomerUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
