/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Daniel
 */
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ex4 - Java");
        
        ArrayList<Double> array = new ArrayList<Double>();
        LinkedList<Double> list = new LinkedList<Double>();
        ArrayDeque<Double> deque = new ArrayDeque<Double>();
        
        Random n = new Random();
        
        long tempo_ini_array;
        long tempo_ini_list;
        long tempo_ini_deque;
        long tempo_fim_array;
        long tempo_fim_list;
        long tempo_fim_deque;
        final int expoente = 6;
        
        tempo_ini_array = System.currentTimeMillis();
        for(int i=0;i<Math.pow(10,expoente);i++){
            array.add(n.nextDouble());
        }
        for(Double d : array){
            System.out.println(d);
        }
        for(int i=0;i<array.size()/2;i++){
            array.get(i);
        }
        array.clear();
        tempo_fim_array = System.currentTimeMillis();
        
        
        tempo_ini_list = System.currentTimeMillis();
        for(int i=0;i<Math.pow(10,expoente);i++){
            list.add(n.nextDouble());
        }
        for(Double d : list){
            System.out.println(d);
        }
        for(int i=0;i<array.size()/2;i++){
            list.get(i);
        }
        list.clear();
        tempo_fim_list = System.currentTimeMillis();
        
        
        tempo_ini_deque = System.currentTimeMillis();
        for(int i=0;i<Math.pow(10,expoente);i++){
            deque.add(n.nextDouble());
        }
        for(Double d : deque){
            System.out.println(d);
        }
        for(int i=0;i<deque.size()/2;i++){
            deque.removeLast();
        }
        deque.clear();
        tempo_fim_deque = System.currentTimeMillis();
        
        
        System.out.println("Tempo array:" + (tempo_fim_array - tempo_ini_array));
        System.out.println("Tempo list:" + (tempo_fim_list - tempo_ini_list));
        System.out.println("Tempo deque:" + (tempo_fim_deque - tempo_ini_deque));
        
    }
    
}
