package com.marina.hexagonal.application.ports.out;

import com.marina.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
