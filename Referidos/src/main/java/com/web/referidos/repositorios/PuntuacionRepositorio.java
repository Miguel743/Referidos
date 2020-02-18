package com.web.referidos.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.referidos.entidades.Puntuacion;

@Repository
public interface PuntuacionRepositorio extends JpaRepository<Puntuacion, Integer>{

}
