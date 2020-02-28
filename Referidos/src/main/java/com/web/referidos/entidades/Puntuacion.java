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
	
	private int precio;
	private int calidad;
	private int tiempo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCalidad() {
		return calidad;
	}
	public void setCalidad(int calidad) {
		this.calidad = calidad;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	/**
	 * @param id
	 * @param precio
	 * @param calidad
	 * @param tiempo
	 */
	public Puntuacion(int id, int precio, int calidad, int tiempo) {
		super();
		this.id = id;
		this.precio = precio;
		this.calidad = calidad;
		this.tiempo = tiempo;
	}
	/**
	 * 
	 */
	public Puntuacion() {
		
	}
	
	
}
