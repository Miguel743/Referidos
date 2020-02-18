package com.web.referidos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.referidos.entidades.PerfilCliente;

@Repository
public interface PerfilClienteRepositorio extends JpaRepository<PerfilCliente, Integer>{

}
