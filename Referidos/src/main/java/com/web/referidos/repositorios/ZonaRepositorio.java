package com.web.referidos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.referidos.entidades.Zona;

@Repository
public interface ZonaRepositorio extends JpaRepository<Zona, Integer>{

}
