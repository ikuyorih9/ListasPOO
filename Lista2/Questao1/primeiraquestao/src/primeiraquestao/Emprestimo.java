package primeiraquestao;

public class Emprestimo extends Produto {
    public float valor;
    
    public Emprestimo(float valor){
        this.valor = valor;
    }
    
    //VERIFICA SE ESTA TUDO OK COM O EMPRESTIMO.
    public boolean verificarDados(){
        if(conta.retornarSaldo() >= 0)
            return true;
        else
            return false;
    }
    
}
