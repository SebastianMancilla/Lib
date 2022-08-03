package com.smg.springboot.kaifuku.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smg.springboot.kaifuku.app.model.Library;

public interface LibRepository extends JpaRepository<Library, Long>{

}
