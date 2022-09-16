
package primeiraquestao;

public abstract class Produto {
    private String status;
    private boolean ativado;
    
    public Produto(){
        status = "";
        ativado = false;
    }
    
    public abstract boolean verificaDados();
    
    public String retornarStatus(){
        return status;
    }
    
    public boolean retornarAtivacao(){
        return ativado;
    }
    
    public void mudarAtivacao(boolean modo){
        ativado = modo;
    }
}
