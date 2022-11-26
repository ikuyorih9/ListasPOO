/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package questao2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


public class FXMLDocumentController implements Initializable {
    private double x5;
    private double x4;
    private double x3;
    private double x2;
    private double x1;
    private double x0;
    
    
    @FXML
    private Label polinomio_label;
    @FXML
    private Label resultado_label;
    @FXML
    private TextField grau5;
    @FXML
    private TextField grau4;
    @FXML
    private TextField grau3;
    @FXML
    private TextField grau2;
    @FXML
    private TextField grau1;
    @FXML
    private TextField grau0;
    @FXML
    private TextField x_textField;
    @FXML
    private Button calcula_button;
    @FXML
    private Button ok_button;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        grau5.textProperty().addListener(
                new ChangeListener<String>(){
                    @Override
                    public void changed(ObservableValue <? extends String> observable, String oldValue, String newValue){
                        if(!newValue.matches("\\d*\\p{Punct}")){
                            grau5.setText(newValue.replaceAll("[^\\d\\p{Punct}]",""));
                        }
                    }
                }
        
        );
        grau4.textProperty().addListener(
                new ChangeListener<String>(){
                    @Override
                    public void changed(ObservableValue <? extends String> observable, String oldValue, String newValue){
                        if(!newValue.matches("\\d*\\p{Punct}")){
                            grau4.setText(newValue.replaceAll("[^\\d\\p{Punct}]",""));
                        }
                    }
                }
        
        );
        grau3.textProperty().addListener(
                new ChangeListener<String>(){
                    @Override
                    public void changed(ObservableValue <? extends String> observable, String oldValue, String newValue){
                        if(!newValue.matches("\\d*\\p{Punct}")){
                            grau3.setText(newValue.replaceAll("[^\\d\\p{Punct}]",""));
                        }
                    }
                }
        
        );
        grau2.textProperty().addListener(
                new ChangeListener<String>(){
                    @Override
                    public void changed(ObservableValue <? extends String> observable, String oldValue, String newValue){
                        if(!newValue.matches("\\d*\\p{Punct}")){
                            grau2.setText(newValue.replaceAll("[^\\d\\p{Punct}]",""));
                        }
                    }
                }
        
        );
        grau1.textProperty().addListener(
                new ChangeListener<String>(){
                    @Override
                    public void changed(ObservableValue <? extends String> observable, String oldValue, String newValue){
                        if(!newValue.matches("\\d*\\p{Punct}")){
                            grau1.setText(newValue.replaceAll("[^\\d\\p{Punct}]",""));
                        }
                    }
                }
        
        );
        grau0.textProperty().addListener(
                new ChangeListener<String>(){
                    @Override
                    public void changed(ObservableValue <? extends String> observable, String oldValue, String newValue){
                        if(!newValue.matches("\\d*\\p{Punct}")){
                            grau0.setText(newValue.replaceAll("[^\\d\\p{Punct}]",""));
                        }
                    }
                }
        
        );
        x_textField.textProperty().addListener(
                new ChangeListener<String>(){
                    @Override
                    public void changed(ObservableValue <? extends String> observable, String oldValue, String newValue){
                        if(!newValue.matches("\\d*\\p{Punct}")){
                            x_textField.setText(newValue.replaceAll("[^\\d\\p{Punct}]",""));
                        }
                    }
                }
        
        );
    }    
    
    @FXML
    private void inserir(){
        if(!grau5.getText().isEmpty())
            x5 = Double.parseDouble(grau5.getText());
        else
            x5 = 0;
        if(!grau4.getText().isEmpty())
            x4 = Double.parseDouble(grau4.getText());
        else
            x4 = 0;
        if(!grau3.getText().isEmpty())
            x3 = Double.parseDouble(grau3.getText());
        else
            x3 = 0;
        if(!grau2.getText().isEmpty())
            x2 = Double.parseDouble(grau2.getText());
        else
            x2 = 0;
        if(!grau1.getText().isEmpty())
            x1 = Double.parseDouble(grau1.getText());
        else
            x1 = 0;
        if(!grau0.getText().isEmpty())
            x0 = Double.parseDouble(grau0.getText());
        else
            x0 = 0;
        polinomio_label.setText(x5 + "x^5" + "+" + x4 + "x^4" + "+" + x3 + "x^3" + "+" + x2 + "x^2" + "+"+ x1 + "x^1" + "+"+ x0);
        System.out.println(polinomio_label.getText());
    }
    @FXML
    private void calcular(){
        if(!x_textField.getText().isEmpty()){
            
        }
        else{
            System.out.println("ERRO");
        }
    }
    
    
    
}
