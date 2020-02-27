package com.web.referidos.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@MappedSuperclass
public class Usuario{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
    private String apellido;
	@Column(name = "mail")
    private String mail;
	@Column(name = "clave")
    private String clave;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "numeracion")
	private String numeracion;
	
	
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
    
	public Usuario(String nombre, String apellido, String mail, String clave, String direccion,String numeracion, Zona zona,
			Foto foto, Date alta, Date baja) {
		
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.clave = clave;
		this.direccion = direccion;
		this.numeracion = numeracion;
		this.zona = zona;
		this.foto = foto;
		this.alta = alta;
		this.baja = baja;
	}

	
	/**
	 * 
	 */
	public Usuario() {
		
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

	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
