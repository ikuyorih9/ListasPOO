
package primeiraquestao;
import java.util.Scanner;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ContaBancaria conta;
    private int ID;
    private ArrayList<Produto> produtos = new ArrayList();
    
    public Cliente (String nome){
        this.nome = nome;
    }
    
    //SOLICITA UMA CONTA BANCARIA.
    public ContaBancaria solicitarContaBancaria(){
        if(conta == null){
            conta = new ContaBancaria("1742417");
            return conta;
        }
        else{
            System.out.println("Ja possui conta!");
        }
        return null;
    }
    
    //SOLICITA UM EMPRESTIMO.
    public Emprestimo solicitarEmprestimo(float valor){
        Emprestimo pedidoEmprestimo = new Emprestimo(valor);
        return pedidoEmprestimo;
    } 
    
    //SOLICITA UM CARTAO DE CREDITO.
    public CartaoCredito solicitarCartao(){
        CartaoCredito cartao = new CartaoCredito(conta, 555, 2027);
        return cartao;
    } 
    
    //MOSTRA SE A CONTA ESTA ATIVADA E SEU SALDO.
    public void dadosConta(){
        if(conta != null)
            conta.mostrarDados();
        else
            System.out.println("Cliente nao ha conta!");
    }
    
    //RETORNA A CONTA DO CLIENTE.
    public ContaBancaria retornarConta(){
        return conta;
    }
    
    //ADICIONA PRODUTO
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    
    //REGISTRA ID.
    public void registrarID(int ID){
        this.ID = ID;
    }
    
    //RETORNA O ID.
    public int retornarID(){
        return ID;
    }
}
