package Modelo.model;

import jakarta.persistence.GeneratedValue;


import java.util.List;

public class Admin {

    private String nome;
    private String email;
    private String senha;
    private List<Produtos> produtos;
}
