package primeiraquestao;

public class Emprestimo extends Produto {
    float valor;
    ContaBancaria conta;
    
    public float valor;
    public ContaBancaria conta;
    
    public Emprestimo(ContaBancaria conta, float valor){
        this.valor = valor;
        this.conta = conta;
    }
    
    public boolean verificaDados(){
        if(conta.retornarSaldo() >= 0 && valor <= 10*conta.retornarSaldo())
            return true;
        else
            return false;
    }
    
}
