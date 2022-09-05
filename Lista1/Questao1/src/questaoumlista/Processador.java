package questaoumlista;
import java.util.*;

public class Processador {
    private float frequencia;
    private int qtdCores;
    private float cache;
    private int temperatura;

    public Processador(float frequencia, int qtdCores, float cache, int temperatura){
        this.frequencia = frequencia;
        this.qtdCores = qtdCores;
        this.cache = cache;
        this.temperatura = temperatura;
    }

    public float retornaFrequencia(){
        return frequencia;
    }

    public float retornaCache(){
        return cache;
    }

    public void verificaTemperatura(){
        if(temperatura > 70)  pararProcessos();
    }
    
    private void pararProcessos(){
        System.out.println("parando alguns processos!");
    }

}