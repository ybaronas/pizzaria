package br.senac.sp.pizzaria.controller;

import br.senac.sp.pizzaria.model.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClienteController {
    @FXML
    private TextField tfId;
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfTelefone;
    @FXML
    private TextArea taEndereco;
    @FXML
    private DatePicker dpNiver;

    public void salvar(){
        Cliente c;
        c = new Cliente();
        c.setTelefone(tfTelefone.getText());
        c.setNome(tfNome.getText());
        c.setEndereco(taEndereco.getText());
        c.setAniversario(dpNiver.getValue());
        //mandar para a service salvar

    }
    public void excluir(){

    }
    public void limpar(){

    }
    public void buscar(){

    }


}
