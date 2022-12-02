package questao1;

import java.util.Stack;

public class Deposito<T> extends Stack<T> {
    
    //atributos
    private int nroMaxUnidades = 10;
    private boolean fechado;

    //construtor
    Deposito() {
        fechado = false;
    }
    
    //retorna o status do depósito(se está fechado ou não)
    public boolean estaFechado() {
        return fechado && isEmpty();
    }
    
    //altera o status do depósito
    synchronized public void fecha() {
        fechado = true;
    }
    
    synchronized public T envia(String nomeConsumidor) {
        
        //se o depósito estiver vazio, espera que o produtor abasteça o depósito
        //antes de liberar o consumo
        while (isEmpty() && !estaFechado()) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                System.out.println("ERRO: " + e.getMessage());
            } 
        }
        
        //verifica se o depósito está fechado, neste caso não há como consumir
        if (estaFechado())
            return null; 
        
        //desempilha o produto consumido
        T produto = pop();
        
        //emite uma notificação à thread do produtor que está 
        //esperando para entregar um novo produto
        notifyAll(); 
        return produto;
    }
    
    synchronized public void recebe(String nomeProdutor, T produto) {
        
        //caso o depósito esteja cheio, espera até que alguém consuma
        //(desempilhe um produto) a fim de que haja espaço para o novo produto
        while (size() == nroMaxUnidades) {
            
            try {
                wait(); 
            } catch (InterruptedException e) {
                System.out.println("ERRO: " + e.getMessage());
            }
            
        }
        //empilha o novo produto
        push(produto);
        
        //emite uma notificação às threads dos consumidores que estão esperando para consumir
        notifyAll(); 
    }
    
}

