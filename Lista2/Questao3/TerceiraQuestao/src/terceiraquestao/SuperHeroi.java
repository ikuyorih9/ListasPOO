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

public class SuperHeroi extends Personagem {

    public SuperHeroi(int vida) {
        this.vida = vida;
    }

    private String nomeVidaReal;

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String pNomeVidaReal) {
        nomeVidaReal = pNomeVidaReal;
    }
}
