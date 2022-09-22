package test;

public abstract class Veiculo {
    protected String nome;
    protected String marca;
    
    public Veiculo(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }
    
    public abstract void listarVerificacoes();
    public abstract void ajustar();
    public abstract void limpar();
}
