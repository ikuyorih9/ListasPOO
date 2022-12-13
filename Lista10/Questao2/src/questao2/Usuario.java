package questao2;

import java.util.*;

public class Usuario implements Runnable{
    private String nome;
    
    private ContaBancaria conta;
    private ContaBancaria_sincronizada conta_sinc;
    
    public Usuario(String nome, ContaBancaria conta){
        this.nome = nome;
        this.conta = conta;
    }
    
    public Usuario(String nome, ContaBancaria_sincronizada conta_sinc){
        this.nome = nome;
        this.conta_sinc = conta_sinc;
    }
    
    @Override
    public void run(){
        int saldoTotal = 0;
        Random  r = new Random();
        for(int i = 0; i < 5000; i++){
            int valor = r.nextInt(20);
            valor += 20;
            if(conta != null)
                conta.depositar(valor, nome);
            if(conta_sinc != null)
                conta_sinc.depositar(valor, nome);
            saldoTotal += valor;
        }
        for(int i = 0; i < 5000; i++){
            int valor = r.nextInt(10);
            if(conta != null)
                conta.sacar(valor, nome);
            if(conta_sinc != null)
                conta_sinc.sacar(valor, nome);
            saldoTotal -= valor;
        }
        
        System.out.println("O saldo dos depositos e saques de " + nome + " foi R$" + saldoTotal);
    }
    
    
}
