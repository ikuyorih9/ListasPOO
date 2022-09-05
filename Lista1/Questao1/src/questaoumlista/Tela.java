package questaoumlista;
import java.util.*;

public class Tela {
    
    private boolean telaTocada;
    private int x;
    private int y;
    private int [] tamanho;

    public Tela(int largura, int altura) {
        tamanho[0] = largura;
        tamanho[1] = altura;
        telaTocada = false;
        x = 0;
        y = 0;
    }
    
    public int retornaLargura() {
        return tamanho[0];
    }
    
    public int retornaAltura() {
        return tamanho[1];
    }

    public int retornaPosicaoX() {
        return x;
    }
    
    public int retornaPosicaoY() {
        return y;
    }

    private void verificaToque() {
        if(telaTocada)
            System.out.println("Voce tocou na tela na posicao (" + x + "," + y +").");
    }

}