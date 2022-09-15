package primeiraquestao;

public class Gerente {
    private String nome;
    private Cliente clientes[] = new Cliente[10];
    
    public void aceitarProduto(Produto produto){
        //VERIFICA PRODUTO PENDENTE.
        if(produto.retornarStatus() == "PENDENTE"){
            
        }
        else{
            System.out.println("Nao e possivel aceitar produto.");
            System.out.println("STATUS: " + produto.retornarStatus());
        }
        
    }
    
}
