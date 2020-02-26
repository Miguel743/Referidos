package com.web.referidos.entidades;

import java.util.Date;


import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table (name = "perfilCliente") 
public class PerfilCliente extends Usuario{

	/**
	 * 
	 */
	public PerfilCliente() {
		super();
		// TODO Auto-generated constructor stub
	}

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
	public PerfilCliente(String nombre, String apellido, String mail, String clave, String direccion, String numeracion,
			Zona zona, Foto foto, Date alta, Date baja) {
		super(nombre, apellido, mail, clave, direccion, numeracion, zona, foto, alta, baja);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
