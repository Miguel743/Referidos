package com.web.referidos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "rubros") 
public class Rubros {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id")
	private int id;
	
	private String rubro;
	
	private String descrip;

	/**
	 * 
	 */
	public Rubros() {
		
	}

	/**
	 * @param id
	 * @param rubro
	 * @param descrip
	 */
	public Rubros(int id, String rubro, String descrip) {
	
		this.id = id;
		this.rubro = rubro;
		this.descrip = descrip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
	
	
}
