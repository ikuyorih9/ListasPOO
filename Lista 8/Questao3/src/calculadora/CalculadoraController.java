package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
    private void clicked0(ActionEvent event) {
        if(tfInput.getText().equals("0"))
            tfInput.clear();
        lbDivZero.setText((""));
        tfInput.appendText("0");
    }
    
    @FXML
    private void clicked1(ActionEvent event) {
         if(tfInput.getText().equals("0"))
            tfInput.clear();
        lbDivZero.setText((""));
        tfInput.appendText("1");;
    }
    
    @FXML
    private void clicked2(ActionEvent event) {
        if(tfInput.getText().equals("0"))
            tfInput.clear();
        lbDivZero.setText((""));
        tfInput.appendText("2");
    }
    
    @FXML
    private void clicked3(ActionEvent event) {
        if(tfInput.getText().equals("0"))
            tfInput.clear();
        lbDivZero.setText((""));
        tfInput.appendText("3");
    }
    
    @FXML
    private void clicked4(ActionEvent event) {
        if(tfInput.getText().equals("0"))
            tfInput.clear();
        lbDivZero.setText((""));
        tfInput.appendText("4");
    }
    
    
    @FXML
    private void clicked5(ActionEvent event) {
        if(tfInput.getText().equals("0"))
            tfInput.clear();
        lbDivZero.setText((""));
        tfInput.appendText("5");
    }
    
    @FXML
    private void clicked6(ActionEvent event) {
        if(tfInput.getText().equals("0"))
            tfInput.clear();
        lbDivZero.setText((""));
        tfInput.appendText("6");
    }
    
    @FXML
    private void clicked7(ActionEvent event) {
        if(tfInput.getText().equals("0"))
            tfInput.clear();
        lbDivZero.setText((""));
        tfInput.appendText("7");
    }
    
    @FXML
    private void clicked8(ActionEvent event) {
        if(tfInput.getText().equals("0"))
            tfInput.clear();
        lbDivZero.setText((""));
        tfInput.appendText("8");
    }
    
    @FXML
    private void clicked9(ActionEvent event) {
        if(tfInput.getText().equals("0"))
            tfInput.clear();
        lbDivZero.setText((""));
        tfInput.appendText("9");
    }
    
    @FXML
    private void clickedEqual(ActionEvent event){
        num2 = Integer.valueOf(tfInput.getText());
        
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
                    tfInput.clear();
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
        lbDivZero.setText((""));
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
        
        //tfInput.addEventFilter(KeyEvent.KEY_TYPED, numeric_Validation(5));
    
        tfInput.setOnMousePressed(new EventHandler<MouseEvent>() {
    
            @Override
            public void handle(MouseEvent event) {
                tfInput.clear();
                lbDivZero.setText((""));
            }
        });
      
    }    
    
}
