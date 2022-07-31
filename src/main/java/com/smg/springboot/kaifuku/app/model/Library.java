package com.smg.springboot.kaifuku.app.model;

import java.io.Serializable;

import javax.persistence.*;


import lombok.*;

@Setter
@Getter
@Entity
@Table(name = "library")
public class Library implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany
	@JoinColumn(name = "address_id")
	private Address address;
}
