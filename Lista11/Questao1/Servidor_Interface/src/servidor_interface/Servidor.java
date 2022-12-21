/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor_interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javafx.application.Platform;
import javafx.scene.control.ListView;

public class Servidor{
    private ServerSocket OUVIDO;
    private Socket SERVIDOR_SOCKET;
    private PrintWriter ENVIA;
    private BufferedReader RECEBE = null;
    private boolean envio_liberado;
    
    
    private String IP;
    private int porta;
    
    public Servidor(int porta, String IP){
        this.IP = IP;
        this.porta = porta;
        try{
            boolean envio_liberado = false;
            ServerSocket OUVIDO = new ServerSocket(porta, 0,InetAddress.getByName(IP));
            SERVIDOR_SOCKET = OUVIDO.accept();
            ENVIA = new PrintWriter(SERVIDOR_SOCKET.getOutputStream(), true);
            RECEBE = new BufferedReader(new InputStreamReader(SERVIDOR_SOCKET.getInputStream()));
                     
            
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("Erro ao criar servidor!");
        }
        catch(RuntimeException e){
            System.out.println("ERRO NO CONSTRUTOR DO SERVIDOR: " + e.getMessage());
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
            SERVIDOR_SOCKET.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public boolean retornaSeConectado(){
        return SERVIDOR_SOCKET.isConnected();
    }
    
    public BufferedReader retornaFluxoEntrada(){
        if(RECEBE != null)
            return RECEBE;
        return null;
    }
    
}
