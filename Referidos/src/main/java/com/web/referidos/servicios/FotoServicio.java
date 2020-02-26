package com.web.referidos.servicios;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.web.referidos.entidades.Foto;
import com.web.referidos.repositorios.FotoRepositorio;


@Service
public class FotoServicio {

	@Autowired
    private FotoRepositorio fotoRepositorio;
    
    @Transactional
    public Foto guardar(MultipartFile archivo) throws ErrorServicio{
    	
            System.out.println(archivo);
            
       if(archivo != null){
           try{
                Foto foto = new Foto();
                foto.setMime(archivo.getContentType());
                foto.setNombre(archivo.getName());
                foto.setContenido(archivo.getBytes());

                return fotoRepositorio.save(foto);
           } catch(Exception e){
               System.err.println(e.getMessage());
           }
       } 

       return null;
    }
    
    @Transactional
    public Foto actualizar(int idFoto, MultipartFile archivo) throws ErrorServicio{
       if(archivo != null){
           try{
                Foto foto = new Foto();
                
                if(fotoRepositorio.existsById(idFoto)){
                    Optional<Foto> respuesta = fotoRepositorio.findById(idFoto);
                    if(respuesta.isPresent()){
                        foto = respuesta.get();
                    }
                }
                
                foto.setMime(archivo.getContentType());
                foto.setNombre(archivo.getName());
                foto.setContenido(archivo.getBytes());

                return fotoRepositorio.save(foto);
           } catch(Exception e){
               System.err.println(e.getMessage());
           }
       } 

       return null;        
    }
}
