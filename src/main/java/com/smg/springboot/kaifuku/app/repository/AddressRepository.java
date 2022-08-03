package com.smg.springboot.kaifuku.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smg.springboot.kaifuku.app.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
