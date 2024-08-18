package Modelo.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int preco;
    private String descrição;

    @ManyToMany(mappedBy = "produtos")
    private List<Produtos> produtos;
}
