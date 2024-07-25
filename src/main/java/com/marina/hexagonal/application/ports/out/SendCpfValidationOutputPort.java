package com.marina.hexagonal.application.ports.out;

public interface SendCpfValidationOutputPort {

    void send(String cpf);
}
