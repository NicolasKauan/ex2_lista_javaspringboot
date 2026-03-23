package com.nika.ex2_lista_javaspringboot.repositories;

import com.nika.ex2_lista_javaspringboot.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}