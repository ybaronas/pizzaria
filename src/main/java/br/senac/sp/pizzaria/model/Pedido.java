package br.senac.sp.pizzaria.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Pedido {
    private Long codigo;
    private Cliente cliente;
    private LocalDateTime previsao;
    private LocalDateTime data;
    private MeioPagamento meioPagamento;
    private List<ItemPedido> itens;
    private String observacao;
    private boolean retira;

    public double getTotal(){
        double total = 0;
        for(ItemPedido item : itens) {
            total += item.getTotal();
        }
        return total;
    }


}
