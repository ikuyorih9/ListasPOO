package primeiraquestao;

public class CartaoCredito extends Produto{
    private ContaBancaria conta;
    private int verificador;
    private int anoValidade;
    
    public CartaoCredito(ContaBancaria conta, int verificador, int anoValidade){
        this.conta = conta;
        this.verificador = verificador;
        this.anoValidade = anoValidade;
    }
    
    //VERIFICA SE ESTÁ TUDO OK COM O CARTAO.
    public boolean verificarDados(){
        if(conta != null)
            return true;
        else
            return false;
    }
}
