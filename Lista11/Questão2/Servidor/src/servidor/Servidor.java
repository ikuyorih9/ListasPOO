/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> mensagens = new ArrayList();
        mensagens.add("");
        
        try {
            //Cria um server socket para receber a conexão da porta 12345
            ServerSocket recebe = new ServerSocket(12345);
            
            Thread Leitura = new Thread(new Leitura(recebe, mensagens));
            Leitura.start();
            
            //multiplos clientes
            while(true) {
                //recebe conexao com os clientes
                Socket Clientes = recebe.accept();
                Thread Cliente = new Thread(new Envia(Clientes, mensagens));
                Cliente.start();
            }
            
         //erro  
        } catch(IOException e) {
            System.exit(1); 
        }
        
    }   
}
