package servidor_interface;

import java.io.BufferedReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ServidorFXMLController implements Initializable {
    
    private Servidor servidor;
    
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
    
    private BufferedReader in_servidor;
    
    @FXML
    private void conectar(ActionEvent event){
        String ip = ip_txtField.getText();  
        String porta = porta_txtField.getText();
        if(servidor == null && !ip.isEmpty() &&  !porta.isEmpty()){
            servidor = new Servidor(Integer.parseInt(porta) , ip);
            //servidor = new Servidor(8080 , "localhost");
            enviar_button.setDisable(true);
            chat_txtField.setDisable(false);
            status_label.setText("Conectado!");
            thread.start();
            
        }
    }
    
    @FXML
    private void enviar(ActionEvent event){
        if(!chat_txtField.getText().isEmpty()){
            boolean result = servidor.enviarMensagem(chat_txtField.getText());
            if(result){
                enviar_button.setDisable(true);
                thread.start();
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    AnimationTimer thread = new AnimationTimer(){
        @Override
        public void handle(long timestamp){
            if(servidor != null){
                boolean result = servidor.recebe(mensagem_listView);
                if(result){
                    enviar_button.setDisable(false);
                    thread.stop();
                }
            }
        }
        
    };
    
}
