/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author ACER
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button BPush;
    
    @FXML
    private Button BPop;
    
    @FXML
    private TextField TFItem;
    
    @FXML
    private ListView LVPilha;
    
    private PilhaClass pilha = new PilhaClass(3);
    
    private void exibeMensagem(AlertType tipo, String titulo, String conteudo) {
        Alert mensagem = new Alert(tipo);
        mensagem.setTitle(titulo);
        mensagem.setHeaderText(null);
        mensagem.setContentText(conteudo);
        mensagem.showAndWait();
    }
    
    @FXML
    private void clicouPush(ActionEvent event) {
        if (TFItem.getText().equals("")) // nada a inserir
            exibeMensagem(AlertType.ERROR, "Erro na inserção.", "Você está inserindo um item vazio.");
        else { // insere
            try {
                pilha.push(TFItem.getText());
                LVPilha.getItems().add(0, TFItem.getText());
                TFItem.setText("");
                exibeMensagem(AlertType.INFORMATION, "Sucesso na inserção.", "Elemento inserido.");
            } catch(PilhaCheia e) {
                exibeMensagem(AlertType.ERROR, "Erro na inserção.", e.getMessage());
            }
        }
    }
    
    @FXML
    private void clicouPop(ActionEvent event) {
        if (! TFItem.getText().equals(""))
            exibeMensagem(AlertType.ERROR, "Erro na remoção.", "Você deve esvaziar a caixa de itens primeiro.");
        else {
            try {
                TFItem.setText(pilha.pop());
                LVPilha.getItems().remove(0);
                exibeMensagem(AlertType.INFORMATION, "Sucesso na remoção.", "Elemento removido.");
            } catch(PilhaVazia e) {
                exibeMensagem(AlertType.ERROR, "Erro na remoção.", e.getMessage());
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TFItem.textProperty().addListener( 
                new ChangeListener<String>() { 
                @Override 
                    public void changed(ObservableValue<? extends String> observable, String oldValue, 
                                        String newValue) { 
                        if (!newValue.matches("\\d*")) { 
                            TFItem.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                    } 
                } 
            );
        }    
    
}
