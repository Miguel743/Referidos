package com.web.referidos.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Comentarios extends Base{

	@OneToOne
	private PerfilCliente usuario;
	
	@Column(name="comentario")
	private String comentario;
	
	@OneToOne
	private Puntuacion puntuacion;

	/**
	 * 
	 */
	public Comentarios() {
		
	}

	/**
	 * @param usuario
	 * @param comentario
	 * @param puntuacion
	 */
	public Comentarios(PerfilCliente usuario, String comentario, Puntuacion puntuacion) {
		
		this.usuario = usuario;
		this.comentario = comentario;
		this.puntuacion = puntuacion;
	}

	public PerfilCliente getUsuario() {
		return usuario;
	}

	public void setUsuario(PerfilCliente usuario) {
		this.usuario = usuario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Puntuacion getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Puntuacion puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	
	
}
