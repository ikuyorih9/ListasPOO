package questaoumlista;
import java.util.*;


public class Telefone {
    private String marca;
    private String modelo;
    private int cargaBateria;
    private boolean modoEconomia;

    public Telefone(String marca, String modelo, int cargaBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.cargaBateria = cargaBateria;
        modoEconomia = false;
    }
    
    public String retornaMarca() {
        return marca;
    }


    public String retornaModelo() {
        return modelo;
    }
    
    public void desligar(){
        System.out.println("Desligando dispositivo...");
    }
    
    private void verificaBateria(){
        if(cargaBateria == 0)
            desligar();
        else if(cargaBateria < 30){
            modoEconomia = true;
            System.out.println("Entrando no modo economia de energia.");
        }
        else{
            modoEconomia = false;
            System.out.println("Saindo do modo economia de energia.");
        }
            
    }

}