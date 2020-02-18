package com.web.referidos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.referidos.entidades.Foto;

@Repository
public interface FotoRepositorio extends JpaRepository<Foto, Integer>{

}
