
package primeiraquestao;

public class Primeiraquestao {

    public static void main(String[] args) {
        //CRIA UMA CONTA BANCARIA.
        ContaBancaria conta = new ContaBancaria("101427");
        
        //CRIA UM GERENTE.
        Gerente hugo = new Gerente("Hugo");

        //CRIAR E REGISTRAR CLIENTE "Asafe";
        Cliente asafe = new Cliente("Asafe");
        hugo.registrarCliente(asafe);
        
        //ASAFE SOLICITA CONTA BANCARIA.
        int idAsafe = asafe.retornarID();
        ContaBancaria novaConta;
        novaConta = (hugo.retornarCliente(idAsafe)).solicitarContaBancaria();
        hugo.aceitarProduto(novaConta, idAsafe);
        
        //ASAFE RETIRA DINHEIRO
        asafe.retornarConta().transferir(100);
        
        //ASAFE PEDE UM EMPRESTIMO de 1000.
        idAsafe = asafe.retornarID();
        Emprestimo emp;
        emp = (hugo.retornarCliente(idAsafe)).solicitarEmprestimo(1000);
        hugo.aceitarProduto(emp, idAsafe);
        
        //ASAFE PEDE UM CARTAO.
        idAsafe = asafe.retornarID();
        CartaoCredito cartao;
        cartao = (hugo.retornarCliente(idAsafe)).solicitarCartao();
        hugo.aceitarProduto(novaConta, idAsafe);
        /*
        if(prod instanceof ContaBancaria){
            ContaBancaria a = (ContaBancaria)prod;
        }
       */
        
          
        
    }
    
}
