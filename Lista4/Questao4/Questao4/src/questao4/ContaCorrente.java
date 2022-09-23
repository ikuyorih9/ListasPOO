package questao4;

public class ContaCorrente {
    private float saldo;
    private float creditoLimite;
    private int pontuacaoSerasa;

    public ContaCorrente(){
        saldo = 0;
        creditoLimite = 0;
    }
    
    public void sacar(float valor) throws LimiteAtingido{
        if(valor > saldo+creditoLimite)
            throw new LimiteAtingido("Limite de credito atingido!");
        saldo -= valor;
    }
    
    public void depositar(float valor) throws DepositoInvalido{
        if(valor < 1)
            throw new DepositoInvalido(valor);
        saldo += valor;
    }
    
    public void setValorLimite(float valor) throws LimiteInvalido{
        creditoLimite = valor;
        
    }
    
    public float retornarSaldo(){
        return saldo;
    }
    
    public float retornarLimite(){
        return creditoLimite;
    }
}
