package br.senac.sp.pizzaria.service;

import br.senac.sp.pizzaria.model.Cliente;

public class ClienteService {
    public void salvar(Cliente cliente){
        if(cliente.getTelefone().isBlank()){
            throw new RuntimeException("O telefone é obragatório!");
        } else if (cliente.getNome().isBlank()) {
            throw new RuntimeException("O nome é obragatório!");
        } else if (cliente.getEndereco().isBlank()) {
            throw new RuntimeException("O endereço é obragatório!");
        } else {
            //manda o cliente pra o BD
        }
    }
}
