/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package terceiraquestao;
import java.util.*;

/**
 *
 * @author ACER
 */

public class Personagem {

    public Personagem() {
    }

    protected int vida;
    private String nome;
    private  List<Superpoder> poderes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
        nome = pNome;
    }

    public int getTotalPoder() {
        return (int) (Math.random()*15);
    }

    public int getVida(){
    return vida;
    }
    public void setVida(int pVida){
    vida = pVida;
    }

    public String getSuperpoder(int pPoder){
        return poderes.get(pPoder-1).getNome();
    }

    public void adicionaPoder(Superpoder superpoder){
        poderes.add(superpoder);
    }

    public void atacar(Personagem atacante, int Superpoder, Personagem alvo){
    double ataque = Math.random();
    if(ataque >= 0.5){
        if(atacante.getTotalPoder() < alvo.getVida()){
            alvo.setVida(alvo.getVida() - atacante.getTotalPoder()); 
        }else{
            alvo.setVida(0);
        }
        
        System.out.println("Ataque de " + atacante.getSuperpoder(Superpoder) + " Realizado!");
    }else {
        System.out.println("Ataque de " + atacante.getSuperpoder(Superpoder) + " Bloqueado pelo oponente!");
    }          
    
    }
}
