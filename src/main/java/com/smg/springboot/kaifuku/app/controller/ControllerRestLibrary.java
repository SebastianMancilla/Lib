package com.smg.springboot.kaifuku.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.smg.springboot.kaifuku.app.model.Library;
import com.smg.springboot.kaifuku.app.services.ILibrary;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/library")
@AllArgsConstructor
public class ControllerRestLibrary {
	
	@Autowired
	private ILibrary iLibrary;
	
	@GetMapping("/all")
	public List<Library> index() {

		return iLibrary.findAll();
	}
}
