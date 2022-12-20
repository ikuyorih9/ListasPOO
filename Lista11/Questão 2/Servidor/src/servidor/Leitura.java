/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Leitura implements Runnable{
    ServerSocket recebe;
    ArrayList<String> mensagens;
    
    Leitura(ServerSocket recebe, ArrayList<String> mensagens) {
        this.recebe = recebe;
        this.mensagens = mensagens;
    }
    
    @Override
    public void run() {
        //buffer de entrada que recebe mensagem do teclado
        BufferedReader Teclado = new BufferedReader(new InputStreamReader(System.in));
        String ler;
        
        try {
            while (true) {
                ler = Teclado.readLine();
                mensagens.add(ler);
                if (ler.equals("tchau")) {
                    System.out.println("Servidor desligando ...");
                    Thread.sleep(2000);
                    recebe.close();
                    System.exit(0);
                }
            }
         //erro   
        } catch(IOException | InterruptedException e) {
            System.exit(1);
        }
    }
}
