
package primeiraquestao;

public class ContaBancaria extends Produto{
    float saldo;
    String numConta;
    
    public ContaBancaria(String numConta){
        this.numConta = numConta;
    }
    
    //DEPOSITA DINHEIRO NA CONTA.
    public void depositar (float valor){
        saldo += valor;
        System.out.println("Voce depositou R$" + valor);
    }
    
    //TRANSFERE DINHEIRO DA CONTA.
    public void transferir (float valor){
        saldo -= valor;
        System.out.println("Voce transferiu R$" + valor);
    }
    
    //INICIALIZA DADOS DA CONTA.
    public boolean verificarDados(){
        saldo = 0;
        return true;
    }
    
    //RETORNA SALDO DA CONTA.
    public float retornarSaldo(){
        return saldo;
    }
    
    //MOSTRA DADOS DA CONTA (ATIVAÇÃO E SALDO).
    public void mostrarDados(){
        if(retornarAtivacao()){
            System.out.print("ATIVADO! e com ");
            System.out.println("Saldo: R$" + saldo);
        }
        else
            System.out.println("DESATIVADO!");
        
        
    }
    
    
}
