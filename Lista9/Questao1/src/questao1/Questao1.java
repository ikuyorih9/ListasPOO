/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao1;

import java.io.File;
import java.io.IOException;

public class Questao1 {

    public static void listarArquivos(String caminho){
        File origem = new File(caminho);
        if(origem.isDirectory()){
            File [] arquivos = origem.listFiles();
            if(arquivos != null){
                for(File arquivo: arquivos){
                    if(arquivo.isDirectory()){
                        try{
                            listarArquivos(arquivo.getCanonicalPath());
                        }
                        catch(IOException e){
                            System.out.println("Erro: " + e.getMessage());
                        }
                    }
                       
                    else
                        System.out.println(arquivo.getName());
                }
            }
           
        }
    }
    
    public static void main(String[] args) {
        listarArquivos("C:\\Windows\\");
    }
    
}
