package com.marina.hexagonal.adapters.out.repository.mapper;

import com.marina.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.marina.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    //transformar customer em customerEntity para usar no InsertCustomerAdapter

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
