package primeiraquestao;

public class Gerente {
    private String nome;
    private Cliente clientes[] = new Cliente[10];
    
    public void aceitarProduto(Produto produto){
        if(!produto.retornarAtivacao() && produto.verificaDados()){
            produto.mudarAtivacao(true);
            System.out.println("Produto aceito");
        }
        else
                System.out.println("Produto nao aceito");
            
    }
    
}
