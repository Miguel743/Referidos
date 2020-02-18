package com.web.referidos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "zona") 
public class Zona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id")
	private int id;
	
	@Column(name ="nombre")
	private String nombre;

	/**
	 * @param id
	 * @param nombre
	 */
	public Zona(int id, String nombre) {
	
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * 
	 */
	public Zona() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
	
	
}
