package com.web.referidos.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table (name = "perfilTrabajador") 
public class PerfilTrabajador extends Usuario{


	@Column(name ="cuit")
	private String cuit;

	
	
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param mail
	 * @param clave
	 * @param direccion
	 * @param numeracion
	 * @param zona
	 * @param foto
	 * @param alta
	 * @param baja
	 */
	public PerfilTrabajador(String nombre, String apellido, String mail, String clave, String direccion,
			String numeracion, Zona zona, Foto foto, Date alta, Date baja,String cuit) {
		super(nombre, apellido, mail, clave, direccion, numeracion, zona, foto, alta, baja);
		this.cuit = cuit;
	}



	/**
	 * @param nombre
	 * @param apellido
	 * @param mail
	 * @param clave
	 * @param domicilio
	 * @param zona
	 * @param foto
	 * @param alta
	 * @param baja
	 */
	


	/**
	
	 */
	public PerfilTrabajador() {
		
	}


	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
	
	
}
