package com.web.referidos.entidades;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table (name = "foto") 
public class Foto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "id")
	private int id;

	@Column(name ="nombre")
	private String nombre;
	
	@Column(name = "mime")
    private String mime;
    
	
    @Lob @Basic(fetch = FetchType.LAZY)
    @Column(name="contenido")
    private byte[] contenido;


	/**
	 * @param id
	 * @param nombre
	 * @param mime
	 * @param contenido
	 */
	public Foto(int id, String nombre, String mime, byte[] contenido) {
		this.id = id;
		this.nombre = nombre;
		this.mime = mime;
		this.contenido = contenido;
	}


	/**
	 * 
	 */
	public Foto() {
		
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


	public String getMime() {
		return mime;
	}


	public void setMime(String mime) {
		this.mime = mime;
	}


	public byte[] getContenido() {
		return contenido;
	}


	public void setContenido(byte[] contenido) {
		this.contenido = contenido;
	}

	
    
}
