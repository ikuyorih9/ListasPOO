/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class PilhaClass {
    private ArrayList<String> dados;
    private int tamanho;
    private int topo;
    
    PilhaClass(int tamanho) {
        dados = new ArrayList();
        this.tamanho = tamanho;
        topo = -1;
    }
    
    public void push(String elemento) throws PilhaCheia {
        if (topo + 1 == tamanho)
            throw new PilhaCheia("A pilha está cheia.");
        topo++;
        dados.add(elemento);
    }
    
    public String pop() throws PilhaVazia {
        if (topo == -1)
            throw new PilhaVazia("A pilha está vazia.");
        topo--;
        return dados.remove(topo + 1);
    }
}
