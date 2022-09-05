package questaoumlista;
import java.util.*;

public class SaidaAudio {
    private int volume;
    private String tipoConexao;
    private String dispositivoSaida;
    
    public SaidaAudio() {
        volume = 50;
        tipoConexao = "main";
        dispositivoSaida = "main";
    }
    
    public void aumentarVolume(){
        if(volume < 100)
            volume++;
        else
            avisoVolume("maximo");
    }
    
    public void diminuirVolume() {
        if(volume > 0)
            volume--;
        else
            avisoVolume("minimo");
    }
    
    public String retornaConexao() {
        return tipoConexao;
    }
    
    public String retornaDispositivoSaida() {
        return dispositivoSaida;
    }
    
    public int retornaVolume() {
        return volume;
    }
    
    private void avisoVolume(String aviso) {
        System.out.println("O volume ja esta no " + aviso + ".");
    }
}