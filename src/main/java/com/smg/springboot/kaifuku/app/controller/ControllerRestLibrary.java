package com.smg.springboot.kaifuku.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.smg.springboot.kaifuku.app.model.Library;
import com.smg.springboot.kaifuku.app.services.LibraryServiceImpl;

@RestController
@RequestMapping("/library")
public class ControllerRestLibrary {
	
	private LibraryServiceImpl libraryServiceImpl;
	
	@GetMapping("/library")
	public List<Library> index() {

		return libraryServiceImpl.findAll();
	}
}
