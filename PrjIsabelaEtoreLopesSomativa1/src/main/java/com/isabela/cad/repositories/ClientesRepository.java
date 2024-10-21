package com.isabela.cad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.isabela.cad.entities.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}