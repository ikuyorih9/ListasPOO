/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao4;

import java.io.*;

/**
 *
 * @author Daniel
 */
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome = "Daniel Contente Romanzini";
        
        // Imprime a string
        System.out.println(nome);
        
        // Cria o array de bytes do meu nome
        byte[] list = nome.getBytes();  
        
        // Cria o arquivo "output.bin" na pasta Questao4, mesma do src
        // Em seguida, imprime o nome arquivo para checar
        File arq_bin = new File("output.bin"); // arquivo binário
        System.out.println(arq_bin.getName());
        File arq_txt = new File("output.txt"); // arquivo txt
        System.out.println(arq_txt.getName());
        
        try{
            // Cria a stream de saída
            // Em seguida escrevemos no arquivo o array de bytes
            FileOutputStream out_stream = new FileOutputStream(arq_bin);
            out_stream.write(list);
            out_stream = new FileOutputStream(arq_txt);
            out_stream.write(list);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
