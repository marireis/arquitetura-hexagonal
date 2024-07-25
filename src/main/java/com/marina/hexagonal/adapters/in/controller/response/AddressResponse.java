package com.marina.hexagonal.adapters.in.controller.response;

import com.marina.hexagonal.adapters.out.repository.entity.AddressEntity;
import lombok.Data;

@Data
public class AddressResponse {

    private String street;
    private String city;
    private String state;
}
