/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author ACER
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //Cria um socket de cliente na porta 12345
            Socket Cliente = new Socket("localhost", 12345);
            //recebe mensagens
            BufferedReader mensagem = new BufferedReader(new InputStreamReader(Cliente.getInputStream()));
            String recebido;

        while (true) {
            recebido = mensagem.readLine();
            System.out.println("O Cliente recebe: " + recebido);
            if (recebido.equals("tchau"))
                break; // termina
        }

        mensagem.close(); 
        Cliente.close();
    }   catch(IOException e) {
        System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
