package questao2;

public class Pessoa implements Comparable <Pessoa>{
    private String nome;
    private int RG;
    
    public Pessoa(String nome, int RG){
        this.nome = nome;
        this.RG = RG;
    }
    
    @Override
    public int compareTo(Pessoa p){
        if(this.RG == p.RG)
            return 0;
        else if(this.RG > p.RG)
            return 1;
        else
            return -1;
    }
    
    public void imprimePessoa(){
        System.out.println("nome: " + nome + ". RG: " + RG);
    }
}
