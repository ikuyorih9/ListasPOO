package test;

public class Bicicleta extends Veiculo{
    private String dono;
    
    public Bicicleta(String nome, String marca, String dono){
        super(nome, marca);
        this.dono = dono;
    }
    
    public void listarVerificacoes(){
        System.out.println("Verificacoes do seu veiculo:");
        System.out.println("\tAjustar");
        System.out.println("\tLimpar");
    }
    public void ajustar(){
        System.out.println("A bicicleta de " + dono + " foi ajustada!");
    }
    public void limpar(){
        System.out.println("A bicicleta de " + dono + " foi limpada!");
    }
}
