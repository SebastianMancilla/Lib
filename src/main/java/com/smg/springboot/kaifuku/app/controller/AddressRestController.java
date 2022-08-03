package com.smg.springboot.kaifuku.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.smg.springboot.kaifuku.app.model.Address;
import com.smg.springboot.kaifuku.app.services.IAddress;

@RestController
@RequestMapping(path= "/address")
public class AddressRestController {
	@Autowired
	private IAddress address;
	
	@GetMapping("/all")
	public ResponseEntity<List<Address>> index() {

		return new ResponseEntity<>(this.address.findAll(), HttpStatus.OK);
	}

}
