package com.web.referidos.servicios;


import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.web.referidos.entidades.Foto;
import com.web.referidos.entidades.PerfilCliente;
import com.web.referidos.entidades.PerfilTrabajador;
import com.web.referidos.entidades.Zona;

import com.web.referidos.repositorios.PerfilClienteRepositorio;
import com.web.referidos.repositorios.PerfilTrabajadorRepositorio;
import com.web.referidos.repositorios.ZonaRepositorio;



@Service
public class UsuariosServicio {

	@Autowired
	private PerfilClienteRepositorio repositorioCliente;
	@Autowired
	private PerfilTrabajadorRepositorio repositorioTrabajador;
	@Autowired
	private ZonaRepositorio zonaRepositorio;
	
	@Autowired
    private FotoServicio fotoServicio;
	
	//@Autowired
	//private DomicilioServicio domicilioServicio;
	//crear un servicio domicilio 
	//@Autowired
	//private DomicilioRepositorio domicilioRepositorio;
	
	@Transactional
    public void registrarC(MultipartFile archivo, String nombre, String apellido, String mail, String clave, String clave2, int idZona,String direccion,String numeracion) throws ErrorServicio{
    //este metodo es para registrar un PerfilCliente hay q agregar mas atri
        System.out.println("ACA ZONA!!"+idZona);
        Zona zona = zonaRepositorio.getOne(idZona);
        //Domicilio domi = domicilioServicio.guardar(direccion,numeracion);
        validar(nombre, apellido, mail, clave, clave2, zona);
        
        
        PerfilCliente usuario = new PerfilCliente();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setMail(mail);
        usuario.setZona(zona);
        usuario.setClave(clave);
        usuario.setDireccion(direccion);
        usuario.setNumeracion(numeracion);
        usuario.setAlta(new Date());
        
        Foto foto = fotoServicio.guardar(archivo);
        usuario.setFoto(foto);
        //usuario.setDomicilio(domi);
        repositorioCliente.save(usuario);
        
    }
	@Transactional
	public void registrarT(MultipartFile archivo, String nombre, String apellido, String mail, String clave, String clave2, int idZona,String cuit,String numeraion,String calle) throws ErrorServicio{
		//este metodo es para registrar un perfilTrabajador
		Zona zona = zonaRepositorio.getOne(idZona);
        
        validar(nombre, apellido, mail, clave, clave2, zona);
        validarCuit(cuit);
        
        PerfilTrabajador usuario = new PerfilTrabajador();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setMail(mail);
        usuario.setZona(zona);
        usuario.setCuit(cuit);
        
        //String enciptada = new BCryptPasswordEncoder().encode(clave);
        usuario.setClave(clave);
        
        usuario.setAlta(new Date());
        
        Foto foto = fotoServicio.guardar(archivo);
        usuario.setFoto(foto);
        
        repositorioTrabajador.save(usuario);
	}

	private void validarCuit(String cuit) throws ErrorServicio{
		//metodo para validar cuit
		if(cuit == null || cuit.isEmpty()){
            throw new ErrorServicio("El Cuit no puede ser nulo.");
        }
		if(cuit.length()!=11) {
			throw new ErrorServicio("El Cuit debe tener 11 caracteres.");
		}
	}
	 
	private void validar(String nombre, String apellido, String mail, String clave, String clave2, Zona zona) throws ErrorServicio{
        //validar campos backends
        if(nombre == null || nombre.isEmpty()){
            throw new ErrorServicio("El nombre del usuario no puede ser nulo.");
        }

        if(apellido == null || apellido.isEmpty()){
            throw new ErrorServicio("El apellido del usuario no puede ser nulo.");
        }
        
        if(mail == null || mail.isEmpty()){
            throw new ErrorServicio("El mail del usuario no puede ser nulo.");
        }
        
        if(clave == null || clave.isEmpty() || clave.length() <= 6){
            throw new ErrorServicio("La clave del usuario no puede ser nula y tiene que tener mas de seis dígitos.");
        }
        
        if(!clave.equals(clave2)){
            throw new ErrorServicio(("Las claves deben ser iguales."));
        }
        
        if(zona == null){
            throw new ErrorServicio("No se encontró la zona solicitada.");
        }
    }
}
