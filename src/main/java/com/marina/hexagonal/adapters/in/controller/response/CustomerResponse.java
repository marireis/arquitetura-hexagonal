package com.marina.hexagonal.adapters.in.controller.response;

import com.marina.hexagonal.adapters.out.repository.entity.AddressEntity;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;
    private AddressEntity address;
    private String cpf;
    private Boolean isValidCpf;
}
