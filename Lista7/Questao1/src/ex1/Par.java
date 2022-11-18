package ex1;

public class Par<T extends Number & Comparable> {
    
    //construtor
    Par(T _primeiro, T _segundo){
        primeiro = _primeiro;
        segundo = _segundo;
    }
    
    //atributos
    private T primeiro;
    private T segundo;
   
    //retorna o maior dos dois
    public T getMax(){
        if(0 >= primeiro.compareTo(segundo))
            return primeiro;
        else
            return segundo;
    }
    
    //retorna o menor dos dois
    public T getMin(){
        if(0 < primeiro.compareTo(segundo))
            return primeiro;
        else
            return segundo;
    }
    
    //retorna uma string resultante da concatenação das strings dos dois objetos
    @Override
    public String toString(){
        return (primeiro.toString() + " " + segundo.toString());
    }
     
}
