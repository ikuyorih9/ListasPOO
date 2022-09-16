
package primeiraquestao;

public abstract class Produto {
    private boolean ativado;
    
    public Produto(){
        ativado = false;
    }
    
    //FUNÇÃO DE VERIFICAÇÃO PRÉ ACEITAÇÃO PELO GERENTE.
    public abstract boolean verificarDados();
    
    //RETORNA SE PRODUTO ESTIVER ATIVADO.
    public boolean retornarAtivacao(){
        return ativado;
    }
    
    //MUDA ATIVAÇÃO PRO MODO ESCOLHIDO.
    public void mudarAtivacao(boolean modo){
        ativado = modo;
    }
}
