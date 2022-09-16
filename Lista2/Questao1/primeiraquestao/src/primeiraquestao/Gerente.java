package primeiraquestao;

import java.util.ArrayList;

public class Gerente {
    private String nome;
    private ArrayList<Cliente> clientes = new ArrayList();
    
    public Gerente(String nome){
        this.nome = nome;
    }
    
    //ACEITAR PRODUTO DE UM USUARIO DE ID "id".
    public void aceitarProduto(Produto produto, int id){
        if(!produto.retornarAtivacao() && produto.verificaDados()){
            produto.mudarAtivacao(true);
            System.out.println("Produto aceito");
            retornarCliente(id).adicionarProduto(produto);
            
        }
        else
            System.out.println("Produto nao aceito");
            
    }
    
    //REGISTRA UM CLIENTE.
    public void registrarCliente(Cliente cliente){
        cliente.registrarID(clientes.size());
        clientes.add(cliente);
    }
    
    //RETORNA UM CLIENTE.
    public Cliente retornarCliente(int id){
        return clientes.get(id);
    }
    
}
