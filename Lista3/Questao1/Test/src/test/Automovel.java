package test;

public class Automovel extends Veiculo{
    private int ano;
    
    public Automovel(String nome, String marca, int ano){
        super(nome, marca);
        this.ano = ano;
    }
    
    public void listarVerificacoes(){
        System.out.println("Verificacoes do seu veiculo:");
        System.out.println("\tAjustar");
        System.out.println("\tLimpar");
        System.out.println("\tTrocar oleo");
    }
    public void ajustar(){
        System.out.print("Veiculo ");
        imprimirInformacoes();
        System.out.println(" ajustado!");
    }
    public void limpar(){
        System.out.print("Veiculo ");
        imprimirInformacoes();
        System.out.println(" limpinho!");
    }
    public void trocarOleo(){
        System.out.print("O oleo do seu ");
        imprimirInformacoes();
        System.out.println(" foi trocado!");
    }
    public void imprimirInformacoes(){
        System.out.print(marca +" "+ nome +" "+ ano);
    }
}
