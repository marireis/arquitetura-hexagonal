package com.marina.hexagonal.adapters.out.client.mapper;
import com.marina.hexagonal.adapters.out.client.response.AddressResponse;
import com.marina.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    //converte o AddresseResponse para Address para usar no FindAddressByZipCodeAdapter
    Address toAddress(AddressResponse addressResponse);
}
