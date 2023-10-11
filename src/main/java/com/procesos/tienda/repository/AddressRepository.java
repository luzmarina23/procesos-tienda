package com.procesos.tienda.repository;

import com.procesos.tienda.model.Address;
import com.procesos.tienda.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {


}
