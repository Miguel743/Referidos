package com.web.referidos.entidades;



import javax.persistence.*;


@Entity 
@Table (name="domicilio")
public class Domicilio extends Base{

	
	private String direccion;
	private String numeracion;
	/**
	 * @param id
	 * @param direccion
	 * @param numeracion
	 */
	public Domicilio( String direccion, String numeracion) {
		
		this.direccion = direccion;
		this.numeracion = numeracion;
	}
	/**
	 * 
	 */
	public Domicilio() {
		
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNumeracion() {
		return numeracion;
	}
	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}
	
	
	
}
