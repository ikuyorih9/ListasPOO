package q03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q03 {

    public static void main(String[] args) {
        
        try{
            //instancia um objeto da classe MyLineNumberReader
            //arquivo 1 tem mais de 10 linhas
            MyLineNumberReader reader =  new MyLineNumberReader("arquivo1.txt");
            
            //arquivo 2 tem menos de 10 linhas
            //MyLineNumberReader reader =  new MyLineNumberReader("arquivo2.txt");
            
            //faz a leitura do arquivo todo
            while(reader.readLine() != -1){
                if(reader.getLineNumber() == 10){
                    System.out.println("Chagamos à linha 10: " + reader.getLine());
                }else{
                     System.out.println(reader.getLine());
                }
            }
            
            //quando o loop while acaba, verifica se o arquivo tina mais do que 10 linhas
            if(reader.getLineNumber() < 10)
                System.out.println("O arquivo não possui 10 linhas");
            
            reader.close();
            
        //tratamento das excessões
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
       
       
    }
    
}
