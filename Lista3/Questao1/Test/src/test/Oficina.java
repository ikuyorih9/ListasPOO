package test;

import java.util.ArrayList;

public class Oficina {
    
    private ArrayList <Veiculo> fila;
    private int proximo = 0;
    
    public Oficina(){
        fila = new ArrayList();
        fila.add(new Automovel("Corolla", "Toyota", 2018));
        fila.add(new Automovel("Gol", "Volkswagem", 2004));
        fila.add(new Bicicleta("Speed", "Monark", "Hugo"));
        fila.add(new Bicicleta("Slow", "Monark", "Daniel"));
    }
    
    public Veiculo proximo(){
        Veiculo v = fila.get(proximo);
        proximo++;
        return v;
    }
    public void manutencao(Veiculo veiculo){
        veiculo.listarVerificacoes();
        veiculo.ajustar();
        veiculo.limpar();
        if(veiculo instanceof Automovel)
            ((Automovel)veiculo).trocarOleo();
    }
}
