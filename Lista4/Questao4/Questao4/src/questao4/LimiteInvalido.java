
package questao4;

public class LimiteInvalido extends RuntimeException {
    public LimiteInvalido(){
        
    }
    
    public LimiteInvalido(String msg){
        super(msg);
        
    }
}
