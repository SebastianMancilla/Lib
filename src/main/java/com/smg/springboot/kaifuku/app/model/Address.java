package com.smg.springboot.kaifuku.app.model;

import java.io.Serializable;
import javax.persistence.*;


import lombok.*;

@Setter
@Getter
@Entity
@Table(name = "address")
@NoArgsConstructor
public class Address implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String location;
	
	@OneToOne(mappedBy = "address")
	private Library library;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	
	
}
