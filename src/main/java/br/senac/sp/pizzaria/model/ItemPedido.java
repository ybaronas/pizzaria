package br.senac.sp.pizzaria.model;

import lombok.Data;

@Data
public class ItemPedido {
    private Long id;
    private Pedido pedido;
    private int qtd;
    private Pizza pizza;
    private double preco;

    public double getTotal(){
        return qtd * preco;
    }

}
