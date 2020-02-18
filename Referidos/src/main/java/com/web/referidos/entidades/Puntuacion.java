package com.web.referidos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Puntuacion") 
public class Puntuacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id")
	private int id;
}
