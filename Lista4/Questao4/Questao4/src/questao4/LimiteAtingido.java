package questao4;

public class LimiteAtingido extends RuntimeException{
    public LimiteAtingido(){
        
    }
    
    public LimiteAtingido(String msg){
        super(msg);
    }
}
