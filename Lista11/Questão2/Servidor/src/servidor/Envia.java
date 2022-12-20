/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Envia implements Runnable{   
    Socket Cliente;
    ArrayList<String> mensagens;
    String enviado = "";
    String envia = "";
    
    Envia(Socket Cliente, ArrayList<String> mensagens) {
        this.Cliente = Cliente;
        this.mensagens = mensagens;
    }
    
    @Override
    public void run() {
        try {
            //fluxo de saida para enviar as mensagens
            PrintWriter enviar = new PrintWriter(new OutputStreamWriter(Cliente.getOutputStream()));
            while (true) {
                envia = mensagens.get(mensagens.size() - 1);
                if (!(envia.equals("") || envia.equals(enviado))) {
                    enviar.println(envia);
                    enviar.flush();
                    enviado = envia;
                }
                
                if (enviado.equals("tchau")) {
                    enviar.close();
                }          
                Thread.sleep(2000);
            }
          //erro  
        } catch(IOException | InterruptedException e) {
            System.exit(1);
        }
    }
}
