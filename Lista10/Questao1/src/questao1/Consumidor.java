package questao1;

public class Consumidor implements Runnable {
    //atributos
    private Deposito<Integer> deposito;
    private String nome;
    private int qtdProdutosConsumidos;
    
    //construtor
    Consumidor(String nome, Deposito<Integer> deposito) {
        this.nome = nome;
        this.deposito = deposito;
        qtdProdutosConsumidos = 0;
    }
    
    //retorna a quantidade de produtos consumidos
    public int getUnidadesConsumido() {
        return qtdProdutosConsumidos;
    }
    
    @Override
    public void run() {
        Integer produto;
        
        //retir um produto do depósito
        while (!deposito.estaFechado()) {
            produto = deposito.envia(nome); 
            
            //se a retirada correu conforme o esperado, incrementa a quantidade de produtos consumidos
            if (produto != null)
                qtdProdutosConsumidos++;
        }
    }
}
