package com.marina.hexagonal.application.ports.in;

import com.marina.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
