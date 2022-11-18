package ex1;

import java.util.Scanner;

public class Questao1 {

   
    public static void main(String[] args) {
 
        //demonstração do funcionamento para duas das subclasses da classe Number:
        Par<Integer> p1 = new Par<Integer>(1,2);
        System.out.printf("Par 1 (Integer)\nmaior: %d\nmenor: %d\ntoString: \"%s\"\n\n", p1.getMax(), p1.getMin(), p1.toString());
        
        Par<Double> p2 = new Par<Double>(3.14,2.7);
        System.out.printf("Par 2 (Double)\nmaior: %f\nmenor: %f\ntoString: \"%s\"\n\n", p2.getMax(), p2.getMin(), p2.toString());
       
    }
    
}
