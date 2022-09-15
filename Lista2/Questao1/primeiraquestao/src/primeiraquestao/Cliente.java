
package primeiraquestao;

public class Cliente {
    private String nome;
    private Gerente GerenteResponsavel = new Gerente();
    
    public Produto solicitarProduto(String tipoProduto){
        if(tipoProduto == "Cartao de credito"){
            
        }
        else if (tipoProduto == "Emprestimo"){
            
        }
        else if(tipoProduto == "Conta bancaria"){
            
        }
        else{
            System.out.println("Esse produto nao esta disponivel!");
            return null;
        } 
    }
   
}
