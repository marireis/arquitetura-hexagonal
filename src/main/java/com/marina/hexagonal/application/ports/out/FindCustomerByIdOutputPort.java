package com.marina.hexagonal.application.ports.out;

import com.marina.hexagonal.application.core.domain.Address;
import com.marina.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
