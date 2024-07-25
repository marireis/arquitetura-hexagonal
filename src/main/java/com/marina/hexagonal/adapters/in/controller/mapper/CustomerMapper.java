package com.marina.hexagonal.adapters.in.controller.mapper;

import com.marina.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.marina.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    //convertendo customerRequest para customer
    Customer toCustomer(CustomerRequest costumerRequest);

    Customer toCustomerresponse(Customer customer);
}
