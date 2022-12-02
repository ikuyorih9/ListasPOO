package questao1;

public class Produtor implements Runnable {
    //atributos
    private String nome;
    private Deposito<Integer> deposito;
    private int unidadesAProduzir;
    
    //construtor
    Produtor(String nome,  Deposito<Integer> deposito, int unidadesAProduzir) {
        this.nome = nome;
        this.deposito = deposito;
        this.unidadesAProduzir = unidadesAProduzir;
    }
    
    @Override
    public void run() {
        
        //envia uma quantidade N de produtos ao depósito
        for (int i=0; i < unidadesAProduzir; i++)
            deposito.recebe(nome, i); 
        
        //finalizada a produção, fecha o depósito
        deposito.fecha();
    }
    
}

