package com.marina.hexagonal.application.ports.out;

import com.marina.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
