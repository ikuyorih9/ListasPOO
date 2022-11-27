package ex3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class CalculadoraController implements Initializable {
    
    private Integer num1 = new Integer(0);
    private Integer num2 = new Integer(0);
    private int op = 0;
    
    @FXML
    private TextField tfInput;
    
    @FXML
    private Label lbDivZero;

    @FXML
    private void cleanTextField(ActionEvent event) {
        //tfInput.setText("");
        lbDivZero.setText("");
    }
    
    @FXML
    private void clickedAdd(ActionEvent event) {
        num1 = Integer.valueOf(tfInput.getText());
        tfInput.setText("0");
        op = 1;
    }
    
    @FXML
    private void clickedSub(ActionEvent event) {
        num1 = Integer.valueOf(tfInput.getText());
        tfInput.setText("0");
        op = 2;
    }
    
    @FXML
    private void clickedMul(ActionEvent event) {
        num1 = Integer.valueOf(tfInput.getText());
        tfInput.setText("0");
        op = 3;
    }
    
    @FXML
    private void clickedDiv(ActionEvent event) {
        num1 = Integer.valueOf(tfInput.getText());
        tfInput.setText("0");
        op = 4;
    }
    
    @FXML
    private void clickedEqual(ActionEvent event){
        num2 = Integer.valueOf(tfInput.getText());
        //tfInput.setText("");
        
        switch(op){
            
            case 1:
                soma();
                break;
            
            case 2:
               subtracao();
                break;
                
            case 3:
                multiplicacao();
                break;
                
            case 4:
                try{
                    divisao();
                }catch(ArithmeticException e){
                    tfInput.setText("");
                    lbDivZero.setText("Não existe divisão por zero!");
                }
                break;
                
                  
        }
        
    }
    
    private void soma(){
        num1 += num2;
        tfInput.setText(num1.toString());
    }
    
    private void subtracao(){
        num1 -= num2;
        tfInput.setText(num1.toString());
    }
    
     private void multiplicacao(){
        num1 *= num2;
        tfInput.setText(num1.toString());;
    }
     
     private void divisao() throws ArithmeticException{
        num1 /= num2;
        tfInput.setText(num1.toString());
    }
      
    @FXML
    private void clickedClear(ActionEvent event) {
        tfInput.setText("0");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tfInput.textProperty().addListener(
            new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                String newValue) {
                if (!newValue.matches("\\d*")) {
                    tfInput.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
            }
        );
        
      
    }    
    
}
