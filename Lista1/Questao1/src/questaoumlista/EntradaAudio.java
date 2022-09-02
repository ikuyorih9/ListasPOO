package questaoumlista;
import java.util.*;

public class EntradaAudio {
    private String dispositivo;
    private boolean mudoAtivado;
    
    public EntradaAudio(String dispositivo) {
        this.dispositivo = "main";
        mudoAtivado = false;
    }
    
    public String retornaDispositivo() {
        return dispositivo;
    }

    public void inverterMudo() {
        mudoAtivado = !mudoAtivado;
    }
    

}