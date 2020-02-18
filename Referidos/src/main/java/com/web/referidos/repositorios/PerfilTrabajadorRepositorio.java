package com.web.referidos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.referidos.entidades.PerfilTrabajador;

@Repository
public interface PerfilTrabajadorRepositorio extends JpaRepository<PerfilTrabajador, Integer>{

}
