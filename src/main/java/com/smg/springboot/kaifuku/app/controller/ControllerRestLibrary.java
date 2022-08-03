package com.smg.springboot.kaifuku.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.smg.springboot.kaifuku.app.model.Library;
import com.smg.springboot.kaifuku.app.services.ILibrary;


@RestController
@RequestMapping(path= "/library")

public class ControllerRestLibrary {
	
	@Autowired
	private  ILibrary iLibrary;
	
	@GetMapping(path = "/all")
	public ResponseEntity<List<Library>> index() {
		
		return new ResponseEntity<>(this.iLibrary.findAll(), HttpStatus.OK);
	}
}
