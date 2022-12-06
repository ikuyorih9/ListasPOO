/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executaveis;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author 12745229
 */
public class Executaveis {
    public static void buscaArq(String local, String tipoArq) {
        File origem = new File(local);
        Arquivo busca = new Arquivo(tipoArq);
        if (origem.isDirectory()) {
            File [] arquivos = origem.listFiles();
            if (arquivos != null)
                for (File arq: arquivos) 
                    if (arq.isDirectory()) 
                        try {
                            buscaArq(arq.getCanonicalPath(), tipoArq);
                        } catch(IOException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                    else
                        if (busca.accept(arq, arq.getName()))
                            System.out.println(arq.getName());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    buscaArq("C:\\Windows\\", ".exe");
    }
    
}
