/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package questao1;

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
    private double [] x = new double [6];
    
    
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
            x[5] = Double.parseDouble(grau5.getText());
        else
            x[5] = 0;
        if(!grau4.getText().isEmpty())
            x[4] = Double.parseDouble(grau4.getText());
        else
            x[4] = 0;
        if(!grau3.getText().isEmpty())
            x[3] = Double.parseDouble(grau3.getText());
        else
            x[3] = 0;
        if(!grau2.getText().isEmpty())
            x[2] = Double.parseDouble(grau2.getText());
        else
            x[2] = 0;
        if(!grau1.getText().isEmpty())
            x[1] = Double.parseDouble(grau1.getText());
        else
            x[1] = 0;
        if(!grau0.getText().isEmpty())
            x[0] = Double.parseDouble(grau0.getText());
        else
            x[0] = 0;
        
        
        String text = "";
        for(int i = 0; i < 6; i++){
            if(x[i] == 0)
                continue;
            else
                if(i != 0)
                    text = "+" + x[i] + "x^" + i + text;
                else
                    text = "+" + x[i];
        }
        
        
        polinomio_label.setText(text);
        System.out.println(polinomio_label.getText());
    }
    @FXML
    private void calcular(){
        if(!x_textField.getText().isEmpty()){
            double valor = Double.parseDouble(x_textField.getText());
            double resultado = 0;
            for(int i = 0; i < 6; i++){
                resultado += x[i]*Math.pow(valor, 4);
            }
            resultado_label.setText(String.valueOf(resultado));
        }
        else{
            System.out.println("ERRO");
        }
    }
    
    
    
}
