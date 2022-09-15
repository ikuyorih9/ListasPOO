
package primeiraquestao;

public class Produto {
    private String status;
    
    public Produto(){
        status = "desativado";
    }
    
    public String retornarStatus(){
        return status;
    }
}
