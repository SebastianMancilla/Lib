package com.smg.springboot.kaifuku.app.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.*;

@Setter
@Getter
@Entity
@Table(name = "address")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String location;
	
	@OneToOne(mappedBy = "address")
	private Library library;
}
