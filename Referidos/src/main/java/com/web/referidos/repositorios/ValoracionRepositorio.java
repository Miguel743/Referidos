package com.web.referidos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.referidos.entidades.Valoracion;

@Repository
public interface ValoracionRepositorio extends JpaRepository<Valoracion, Integer>{

}
