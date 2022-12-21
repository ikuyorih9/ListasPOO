package cliente_interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javafx.scene.control.ListView;


public class Cliente {
    
    private Socket CLIENTE_SOCKET;
    private PrintWriter ENVIA;
    private BufferedReader RECEBE;
    private boolean envio_liberado;
    
    public Cliente(int porta, String ip){
        try{
            CLIENTE_SOCKET = new Socket(ip, porta);   
            ENVIA = new PrintWriter(CLIENTE_SOCKET.getOutputStream(), true);
            RECEBE = new BufferedReader(new InputStreamReader(CLIENTE_SOCKET.getInputStream()));
            boolean envio_liberado = true;
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    
    public boolean enviarMensagem(String mensagem){
        try{
            ENVIA.println(mensagem);
            envio_liberado = false;
            return true;
        }
        catch(RuntimeException e){
            e.printStackTrace();
            System.out.println("Erro ao enviar mensagem do cliente ao servidor!");
            return false;
        }
    }
    
    public boolean recebe(ListView listaMensagens){

        try{
            String mensagemRecebida = RECEBE.readLine();
            System.out.println(mensagemRecebida);
            listaMensagens.getItems().add(mensagemRecebida);
            envio_liberado = true;
            return true;
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Erro ao receber mensagem!");
            return false;
        }   
    }
    
    public void liberaFluxos(){
        try{
            ENVIA.close();
            RECEBE.close();
            CLIENTE_SOCKET.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public BufferedReader fluxoEntradaCliente(){
        return RECEBE;
    }
    
    public PrintWriter fluxoSaidaCliente(){
        return ENVIA;
    }
    
}