
package primeiraquestao;

public class ContaBancaria {
    float saldo;
    String numConta;
    CartaoCredito cartao;
    
    public ContaBancaria(){
        
    }
    
    public boolean verificaDados(){
        saldo = 0;
        possuiCartao = false;
        return true;
    }
    
    public void depositar (float valor){
        saldo += valor;
        System.out.println("Voce depositou R$" + valor);
    }
    
    public void transferir (float valor){
        saldo -= valor;
        System.out.println("Voce transferiu R$" + valor);
    }
    
    public float retornarSaldo(){
        return saldo;
    }
    
    public void mostraDados(){
        if(retornarAtivacao()){
            System.out.print("ATIVADO! e com ");
            System.out.println("Saldo: R$" + saldo);
        }
        else
            System.out.println("DESATIVADO!");
        
        
    }
    
    
}
