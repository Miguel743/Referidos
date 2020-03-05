package com.web.referidos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.referidos.entidades.Comentarios;

@Repository
public interface ComentarioRepositorio extends JpaRepository<Comentarios, Integer> {
	

}
