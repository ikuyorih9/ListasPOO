/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import objetos.Word;
import objetos.Excel;

/**
 *
 * @author Daniel
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //System.out.println("Client");
        
        try{
            //Cria um socket de cliente na porta 8008.
            Socket CLIENTE = new Socket("localhost", 8008);
            
            //Cria um fluxo de saída para enviar mensagens ao servidor.
            ObjectOutputStream out_servidor = new ObjectOutputStream(CLIENTE.getOutputStream());
            
            //Cria um buffer de entrada para receber mensagens do servidor.
            BufferedReader in_servidor = new BufferedReader(
                    new InputStreamReader(CLIENTE.getInputStream()));
            
            //Cria um buffer de entrada para receber mensagens do teclado.
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            
            //Lê a autenticação do teclado.
            String autenticacao = in.readLine();
            
            Word word_doc = new Word(); 
            
            //Verifica se o status da conexão recebida é 1 (SUCESSO).
            if(in_servidor.readLine().compareTo("1") == 0){
                
                System.out.println(in_servidor.readLine());
                
                String leituraServidor;
                
                while(true){

                        // Digitar qualquer tecla para enviar os documentos
                        leituraServidor = in.readLine();
                        
                        out_servidor.writeObject(new Excel());
                        
                        out_servidor.writeObject(new Word());
                        
                        System.out.println(in_servidor.readLine());
                        
                }
                    
            }
                
            //Se o status da conexão é 0.
            else{
                System.out.println(in_servidor.readLine());
            }
            
            System.out.println("FIM DA CONEXÃO!");
            CLIENTE.close();
            out_servidor.close();
            in_servidor.close();
            in.close();
            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
