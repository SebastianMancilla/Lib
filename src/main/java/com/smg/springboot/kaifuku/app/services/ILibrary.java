package com.smg.springboot.kaifuku.app.services;

import java.util.List;

import com.smg.springboot.kaifuku.app.model.Library;


public interface ILibrary {
	
public List<Library> findAll();
	
	public Library findById(Long id);
	
	public Library save(Library library);
	
	public void delete(Long id);
}
