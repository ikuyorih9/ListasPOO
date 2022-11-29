package q03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLineNumberReader {
    
    //construtor
    MyLineNumberReader(String arquivo) throws FileNotFoundException{
        
        //inicializa os atributos
        this.line = new StringBuilder();
        this.fr = new FileReader(arquivo);
        this.lineNumber = 0;
        
    }
    
    //atributos
    FileReader fr;
    private int lineNumber;
    private StringBuilder line;
    
    //lê uma linha inteira
    public int readLine() throws IOException{
        
        //verifica se não chegou ao fim do arquivo
        if(!fr.ready()){
            return -1;
        }
        
        char c[] = new char[1];
        
        //limpa o stringbuffer para ler a nova linha
        line.delete(0, line.length());
        
        //lê até o fim da linha
        while(fr.read(c)== 1 && c[0]!= '\n'){
            line.append(c[0]);
 
        }
        
        //incrementa o numero de lihas
        lineNumber += 1;
        return 0;
        
        
    }
    
    //retorna o numero de linhas
    public int getLineNumber( ){
        return lineNumber;
    }
    
    //retorna a linha
    public String getLine( ){
        return line.toString();
    }
    
    //fecha o filereader
    public void close(){
        try {
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(MyLineNumberReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
