package com.web.referidos.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "usuario") 
public class Usuario extends Base{
	
	
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
    private String apellido;
	@Column(name = "mail")
    private String mail;
	@Column(name = "clave")
    private String clave;
	
	@OneToOne
    private Domicilio domicilio;
	
    @ManyToOne
    private Zona zona;
    
    @OneToOne
    private Foto foto;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date alta;

    @Temporal(TemporalType.TIMESTAMP)
    private Date baja;

	/**
	 * @param id
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
    
	public Usuario(String nombre, String apellido, String mail, String clave, Domicilio domicilio, Zona zona,
			Foto foto, Date alta, Date baja) {
		
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.clave = clave;
		this.domicilio = domicilio;
		this.zona = zona;
		this.foto = foto;
		this.alta = alta;
		this.baja = baja;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public Foto getFoto() {
		return foto;
	}

	public void setFoto(Foto foto) {
		this.foto = foto;
	}

	public Date getAlta() {
		return alta;
	}

	public void setAlta(Date alta) {
		this.alta = alta;
	}

	public Date getBaja() {
		return baja;
	}

	public void setBaja(Date baja) {
		this.baja = baja;
	}
    
    
}
