package com.smg.springboot.kaifuku.app.services;

import java.util.List;

import com.smg.springboot.kaifuku.app.model.Address;



public interface IAddress {
public List<Address> findAll();
	
	public Address findById(Long id);
	
	public Address save(Address address);
	
	public void delete(Long id);
}
