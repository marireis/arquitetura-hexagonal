package com.marina.hexagonal.application.core.usecase;

import com.marina.hexagonal.application.core.domain.Customer;
import com.marina.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.marina.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.marina.hexagonal.application.ports.out.InsertCustomerOutputPort;
import com.marina.hexagonal.application.ports.out.SendCpfValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {
    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomeroutputPort;

    private final SendCpfValidationOutputPort sendCpfValidationOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 InsertCustomerOutputPort insertCustomeroutputPort,
                                 SendCpfValidationOutputPort sendCpfValidationOutputPort){
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomeroutputPort = insertCustomeroutputPort;
        this.sendCpfValidationOutputPort = sendCpfValidationOutputPort;
    }

    //INSERINDO CLIENTES
    @Override
    public  void insert(Customer customer, String zipCode){
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomeroutputPort.insert(customer);
        sendCpfValidationOutputPort.send(customer.getCpf());
    }
}
