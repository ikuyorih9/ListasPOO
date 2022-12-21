/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

// Rode primeiro o server e depois o client!

/**
 *
 * @author Daniel
 */
public class Server extends TesteDeExecucao{
    
    public static void main(String[] args) {
        
        //System.out.println("Server");
        
        try{
            //Cria um server socket para receber a conexão da porta 8008.
            ServerSocket conexao = new ServerSocket(8008);
            
            //Cria um SOCKET para receber a conexão com o cliente.
            Socket SERVIDOR = conexao.accept();
            
            //Cria um fluxo de saída para enviar mensagens ao cliente.
            PrintWriter out_cliente = new PrintWriter(SERVIDOR.getOutputStream(),true);
            
            //Cria um buffer de entrada para receber mensagens do cliente.
            ObjectInputStream in_cliente = new ObjectInputStream(SERVIDOR.getInputStream()); 
            
            //Envia sucesso ao cliente.
            out_cliente.println(1);
            
            //Envia sucesso ao cliente e a tela padrão.
            System.out.println("Conexão aceita! Você foi autenticado!");
            out_cliente.println("Conexão aceita! Você foi autenticado!");

            Object leituraServidor;

            //Laço é executado até que seja dito para parar.
            while(true){
                    
                try {
                    leituraServidor = in_cliente.readObject();
                    //System.out.println(leituraServidor);
                    testar(leituraServidor);
                    out_cliente.println("Requisições Recebidas!");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }

                //out_cliente.println(leituraServidor);
                 
            }
            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        
    }
    
}
