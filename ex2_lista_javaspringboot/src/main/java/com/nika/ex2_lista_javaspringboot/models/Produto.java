package com.nika.ex2_lista_javaspringboot.models;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "Produto")
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_produto")
    private String nome;

    @Column(name = "valor_preco")
    private BigDecimal preco;

    private Integer estoque;

    // getters e setters
}