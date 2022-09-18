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

public class Vilao extends Personagem {

    public Vilao(int vida) {
        this.vida = vida;
    }

    private int anosDePrisao;

    public void setAnosDePrisao(int pAnosDePrisao) {
        anosDePrisao = pAnosDePrisao;
    }

    public int getAnosDePrisao() {
        return anosDePrisao;
    }

}
