package com.smg.springboot.kaifuku.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.smg.springboot.kaifuku.app.model.Library;

public interface LibRepository extends CrudRepository<Library, Long>{

}
