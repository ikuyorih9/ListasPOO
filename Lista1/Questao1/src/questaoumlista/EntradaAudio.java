package questaoumlista;
import java.util.*;

//SISTEMA DE COMUNICAÇÃO.
public class EntradaAudio {
    private String nomeMicrofone;
    private boolean mudoAtivado;
    
    public EntradaAudio() {
        this.nomeMicrofone = "main";
        mudoAtivado = false;
    }
    
    public void configuraMicrofone(String nomeMicrofone){
        if(testeMicrofone()){
            this.nomeMicrofone = nomeMicrofone;
            System.out.println("Microfone "+nomeMicrofone+" conectado!");
        }
        else
            System.out.println("Nao foi possivel conectar a "+nomeMicrofone+".");
    }
    
    public String retornaNomeMicrofone() {
        return nomeMicrofone;
    }
    public void inverterMudo() {
        mudoAtivado = !mudoAtivado;
    }
    
    private boolean testeMicrofone(){
        mudoAtivado = false;
        System.out.println("Testando entrada de audio...");
        mudoAtivado = true;
        
        return true;
    }
    

}