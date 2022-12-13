package questao3;

import java.util.Random;

public class Calculo extends Thread { 
// extends threads permite funcionar concorrentemente a outro processo
    
    private int x;
    
    Calculo(int n) {
        this.x=n;
    }
    
    @Override
    public void run() {
        
        // Item b/c
        /*
        Random n = new Random();
        
        for(int i=0;i<10;i++){
            long tempoInicial = System.currentTimeMillis();
            for(int j=0;j<x;j++){
                Math.sqrt(n.nextDouble());
            }
            long tempoFinal = System.currentTimeMillis();
            System.out.println(tempoFinal - tempoInicial);
        }
        */
        
        // Item d
        /*
        for(int i=0;i<10;i++){
            
            int numero=0;
            
            long tempoInicial = System.currentTimeMillis();
            for(int j=0;j<x;j++){
                numero++;
            }
            long tempoFinal = System.currentTimeMillis();
            System.out.println(tempoFinal - tempoInicial);
        }
        */
        
        // Item e
        Random n = new Random();
        
        for(int i=0;i<10;i++){
            
            double numero=0;
            
            long tempoInicial = System.currentTimeMillis();
            for(int j=0;j<x;j++){
                numero=Math.sqrt(n.nextDouble())+Math.pow(10,n.nextDouble())+Math.cos(n.nextDouble());
            }
            long tempoFinal = System.currentTimeMillis();
            System.out.println(tempoFinal - tempoInicial);
        }
       
    }
    
}
