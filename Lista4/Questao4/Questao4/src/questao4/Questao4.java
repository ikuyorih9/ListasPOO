package questao4;

public class Questao4 {
    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente();
        try{
            c.setValorLimite(1500);
            c.depositar(1000);
            System.out.println(c.retornarSaldo());
            //c.sacar(3000);
            c.sacar(2000);
            System.out.println(c.retornarSaldo());
            //c.depositar(-100);
        }
        catch(RuntimeException erro){
            System.out.println(erro.getMessage());
        }
        
        
        
    }
    
}
