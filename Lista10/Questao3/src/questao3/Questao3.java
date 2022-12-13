/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao3;

import java.util.*;

/**
 *
 * @author Daniel
 */
public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        // Item a
        /*
        Random n = new Random();
        
        for(int v=0;v<10;v++){
            long tempoInicial = System.currentTimeMillis();
            for(int i=0;i<Math.pow(10,7);i++){
                Math.sqrt(n.nextDouble());
            }
            long tempoFinal = System.currentTimeMillis();
            System.out.println( tempoFinal - tempoInicial );
        }
        */
        
        // Item b/c
        /*
        int nCores = Runtime.getRuntime().availableProcessors();
        System.out.println(nCores);
        Há 8 threads
        */
        /*
        // Item b/c/d/e
        Scanner scan = new Scanner(System.in);
        
        double operacoes = scan.nextInt();
        operacoes = Math.pow(10,operacoes);
        
        int op_por_thread = (int) (operacoes/8);
                
        Calculo c1 = new Calculo(op_por_thread);
        Calculo c2 = new Calculo(op_por_thread);
        Calculo c3 = new Calculo(op_por_thread);
        Calculo c4 = new Calculo(op_por_thread);
        Calculo c5 = new Calculo(op_por_thread);
        Calculo c6 = new Calculo(op_por_thread);
        Calculo c7 = new Calculo(op_por_thread);
        Calculo c8 = new Calculo(op_por_thread);
        
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();*/
        
        // Item d   
        /*
        int x = (int) Math.pow(10,7);
        
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
        int x = (int) Math.pow(10,7);
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
