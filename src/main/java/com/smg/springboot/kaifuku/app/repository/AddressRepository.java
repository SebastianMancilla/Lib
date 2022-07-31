package com.smg.springboot.kaifuku.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.smg.springboot.kaifuku.app.model.Address;

public interface AddressRepository extends CrudRepository<Address, Long>{

}
