package com.smg.springboot.kaifuku.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.smg.springboot.kaifuku.app.model.Address;
import com.smg.springboot.kaifuku.app.services.IAddress;

@RestController
@RequestMapping("/address")
public class AddressRestController {
	@Autowired
	private IAddress address;
	
	@GetMapping("/all")
	public List<Address> index() {

		return address.findAll();
	}

}
