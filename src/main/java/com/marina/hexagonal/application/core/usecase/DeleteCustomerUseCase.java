package com.marina.hexagonal.application.core.usecase;

import com.marina.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.marina.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.marina.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerUseCase implements DeleteCustomerByIdInputPort {

   private final FindCustomerByIdInputPort findCustomerByIdInputPort;
   private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

   public DeleteCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort,
                                DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort){
       this.findCustomerByIdInputPort = findCustomerByIdInputPort;
       this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
   }

   @Override
   public  void delete(String id){
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutputPort.delete(id);
    }


}
