package questao4;

public class DepositoInvalido extends RuntimeException{
    public DepositoInvalido(){
          
    }
    
    public DepositoInvalido(String msg){
        super(msg);
    }
    
    public DepositoInvalido(float valor){
        super("Nao e possivel depositar R$"+ valor);
    }
    
}
