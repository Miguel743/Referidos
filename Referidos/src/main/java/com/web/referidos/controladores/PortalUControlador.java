package com.web.referidos.controladores;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.web.referidos.entidades.Zona;
import com.web.referidos.repositorios.ZonaRepositorio;
import com.web.referidos.servicios.ErrorServicio;
import com.web.referidos.servicios.UsuariosServicio;





@Controller
@RequestMapping("/")
public class PortalUControlador implements ErrorController{

	@Autowired
    private ZonaRepositorio zonaRepositorio;
    
	@Autowired
	private UsuariosServicio servicios;
	
	@GetMapping("/home")
	@CrossOrigin(origins = "*")
	@Transactional
    public String index(ModelMap modelo){
		 List<Zona> zonas = zonaRepositorio.findAll();
	        modelo.put("zonas", zonas);
	        
		System.out.print("pase POR ACA");
        return "index.html";
    }
	
//	@ResponseBody
	@PostMapping("/registrar")
	public String registrar(ModelMap modelo, MultipartFile archivo,@RequestParam String nombre, @RequestParam String apellido,@RequestParam String mail,@RequestParam String clave,@RequestParam String clave2,@RequestParam int idZona,@RequestParam String direccion,@RequestParam String numeracion) {
		try {
			
            servicios.registrarC(archivo, nombre, apellido, mail, clave, clave2, idZona, direccion, numeracion);
            servicios.getClass();
         
        } catch (ErrorServicio ex) {
            
            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("apellido", apellido);
            modelo.put("mail",mail);
            modelo.put("clave",clave);
            modelo.put("clave2",clave);
            modelo.put("idZona",idZona);
            modelo.put("direccion",direccion);
            modelo.put("numeracion",numeracion);
            
            return "index.html";
        }
        

		return "index.html";
	}
	
	//seccion Errores

	@RequestMapping(value = "/error", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView renderErrorPage(HttpServletRequest httpRequest) {

        ModelAndView errorPage = new ModelAndView("error");
        String errorMsg = "";
        int httpErrorCode = getErrorCode(httpRequest);

        switch (httpErrorCode) {
            case 400: {
                errorMsg = "El recurso solicitado no existe.";
                break;
            }
            case 403: {
                errorMsg = "No tiene permisos para acceder al recurso.";
                break;
            }
            case 401: {
                errorMsg = "No se encuentra autorizado.";
                break;
            }
            case 404: {
                errorMsg = "El recurso solicitado no fue encontrado.";
                break;
            }
            case 500: {
                errorMsg = "Ocurrió un error interno.";
                break;
            }
        }

        errorPage.addObject("codigo", httpErrorCode);
        errorPage.addObject("mensaje", errorMsg);
        return errorPage;
    }

    private int getErrorCode(HttpServletRequest httpRequest) {
        
        Map mapa = httpRequest.getParameterMap();
        for(Object key : mapa.keySet()){
            String[] valores = (String[]) mapa.get(key);
            for(String valor : valores){
                System.out.println(key.toString() + ": " + valor);
            }
        }
        
        
        Enumeration<String> atributos = httpRequest.getAttributeNames();
        while(atributos.hasMoreElements()){
            String key = atributos.nextElement();
            System.out.println(key + ":" + httpRequest.getAttribute(key));
        }
        
        return (Integer) httpRequest.getAttribute("javax.servlet.error.status_code");
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
	
	
}
