package com.web.referidos.servicios;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.referidos.entidades.Domicilio;
import com.web.referidos.repositorios.DomicilioRepositorio;

@Service
public class DomicilioServicio {

	@Autowired
	private DomicilioRepositorio repositorio;
	
	@Transactional
	public Domicilio guardar(String direccion,String numeracion) throws ErrorServicio{
		
		System.out.println("guardar"+direccion );
		
		if(direccion != "" || numeracion != "") {
			try {
				Domicilio dom = new Domicilio(direccion,numeracion);
				return repositorio.save(dom);
			}catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return null;
	}
}
