package com.isabela.cad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.isabela.cad.entities.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

}