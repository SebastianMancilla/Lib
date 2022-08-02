package com.smg.springboot.kaifuku.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smg.springboot.kaifuku.app.model.Address;
import com.smg.springboot.kaifuku.app.repository.AddressRepository;

@Service
public class AddressImp implements IAddress {
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public List<Address> findAll() {
		return (List<Address>) addressRepository.findAll();
	}

	@Override
	public Address findById(Long id) {
		return addressRepository.findById(id).orElse(null);
	}

	@Override
	public Address save(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public void delete(Long id) {
		addressRepository.deleteById(id);
		
	}

}
