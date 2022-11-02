import java.lang.Math;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Double> array = new ArrayList<Double>();
        LinkedList<Double> lista_encadeada = new LinkedList<Double>();

        //Array
        long tempoInicial = System.currentTimeMillis();
        for(int i=0;i<Math.pow(10,6);i++){
            array.add(Math.random());
        }
        for(int i=0;i<Math.pow(10,5);i++){
            array.get((int)(Math.random()*Math.pow(10,5)));
        }
        long tempoFinal = System.currentTimeMillis();

        System.out.println( tempoFinal - tempoInicial );


        tempoInicial = System.currentTimeMillis();
        for(int i=0;i<Math.pow(10,5);i++){
            array.remove((int)(Math.random()*Math.pow(10,5)));
        }
        for(int i=0;i<Math.pow(10,5);i++){
            array.add(Math.random());
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println( tempoFinal - tempoInicial );

        

        //Lista Encadeada
        tempoInicial = System.currentTimeMillis();
        for(int i=0;i<Math.pow(10,6);i++){
            lista_encadeada.add(Math.random());
        }
        for(int i=0;i<Math.pow(10,5);i++){
            lista_encadeada.get((int)(Math.random()*Math.pow(10,5)));
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println( tempoFinal - tempoInicial );

        
        tempoInicial = System.currentTimeMillis();
        for(int i=0;i<Math.pow(10,5);i++){
            lista_encadeada.remove((int)(Math.random()*Math.pow(10,5)));
        }
        for(int i=0;i<Math.pow(10,5);i++){
            lista_encadeada.add(Math.random());
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println( tempoFinal - tempoInicial );
 
    }
}

//double rand = Math.random();
