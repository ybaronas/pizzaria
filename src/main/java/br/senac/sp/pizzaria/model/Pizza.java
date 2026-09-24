package br.senac.sp.pizzaria.model;

import lombok.Data;

@Data
public class Pizza {
    private Long id;
    private String sabor;
    private TipoPizza tipo;
    private Tamanho tamanho;
    private Borda borda;
    private double preco;
    private String ingredientes;

}
