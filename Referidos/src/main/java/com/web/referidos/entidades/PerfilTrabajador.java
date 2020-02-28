package com.web.referidos.entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "perfilTrabajador") 
public class PerfilTrabajador extends Usuario{


	@Column(name ="cuit")
	private String cuit;

	@OneToOne
	private Rubros rubro;
	
	@OneToMany
	private List<Comentarios> comentarios;
	
	@Column(name="porsentaje")
	private double porsentaje;
	@Column(name="cantidadP")
	private double cantP;
	@Column(name="cantidadC")
	private double cantC;
	@Column(name="cantidadT")
	private double cantT;
	
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



	public Rubros getRubro() {
		return rubro;
	}



	public void setRubro(Rubros rubro) {
		this.rubro = rubro;
	}



	public List<Comentarios> getComentarios() {
		return comentarios;
	}



	public void setComentarios(List<Comentarios> comentarios) {
		this.comentarios = comentarios;
	}



	public double getPorsentaje() {
		return porsentaje;
	}



	public void setPorsentaje(double porsentaje) {
		this.porsentaje = porsentaje;
	}



	public double getCantP() {
		return cantP;
	}



	public void setCantP(double cantP) {
		this.cantP = cantP;
	}



	public double getCantC() {
		return cantC;
	}



	public void setCantC(double cantC) {
		this.cantC = cantC;
	}



	public double getCantT() {
		return cantT;
	}



	public void setCantT(double cantT) {
		this.cantT = cantT;
	}
	
	
	
}
