package cliente_interface;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.animation.AnimationTimer;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author hugo_
 */
public class ClienteFXMLController implements Initializable {

    private Cliente cliente;
    
    @FXML
    private Button conectar_button;
    
    @FXML
    private TextField ip_txtField;
    
    @FXML
    private TextField porta_txtField;
    
    @FXML
    private TextField chat_txtField;
    
    @FXML
    private Button enviar_button;
    
    @FXML
    private ListView mensagem_listView;
    
    @FXML
    private Label status_label;
    
    @FXML
    private void conectar(ActionEvent event){
        String ip = ip_txtField.getText();  
        String porta = porta_txtField.getText();
        if(cliente == null && !ip.isEmpty() &&  !porta.isEmpty()){
            cliente = new Cliente(Integer.parseInt(porta) , ip);
            //cliente = new Cliente(8080 , "localhost");
            enviar_button.setDisable(false);
            chat_txtField.setDisable(false);
            chat_txtField.setEditable(true);
            status_label.setText("Conectado!");
        }
    }
    
    @FXML
    private void enviar(ActionEvent event){
        if(!chat_txtField.getText().isEmpty()){
            try{
                boolean result = cliente.enviarMensagem(chat_txtField.getText());
                if(result){
                    enviar_button.setDisable(true);
                    thread.start();
                }
                    
            }
            catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    AnimationTimer thread = new AnimationTimer(){
        @Override
        public void handle(long timestamp){
            if(cliente != null){
                boolean result = cliente.recebe(mensagem_listView);
                if(result){
                    enviar_button.setDisable(false);
                    thread.stop();
                }
            }
        }
        
    };
    
}
