package com.marina.hexagonal.application.ports.in;

import com.marina.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
