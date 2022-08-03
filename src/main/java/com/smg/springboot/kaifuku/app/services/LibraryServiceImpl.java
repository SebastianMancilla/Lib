package com.smg.springboot.kaifuku.app.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smg.springboot.kaifuku.app.model.Library;
import com.smg.springboot.kaifuku.app.repository.LibRepository;

@Service
public class LibraryServiceImpl implements ILibrary{
	
	@Autowired
	private LibRepository libRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Library> findAll() {
		return libRepository.findAll();
	}

	@Override
	public Library findById(Long id) {
		return libRepository.findById(id).orElse(null);
	}

	@Override
	public Library save(Library library) {
		return libRepository.save(library);
	}

	@Override
	public void delete(Long id) {
		 libRepository.deleteById(id);
	}
	
	
}
