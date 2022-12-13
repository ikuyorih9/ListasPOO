package questao2;

public class ContaBancaria{
    private int saldo;
    
    public ContaBancaria(){
        saldo = 0;
    }
    
    public void depositar(int valor, String usuario){
        saldo += valor;
        System.out.println(usuario + " depositou R$" + valor + "!");
    }
    
    public void sacar(int valor, String usuario){
        if(saldo - valor >= 0){
            saldo -= valor;
            System.out.println(usuario +  " sacou R$" + valor + "!");
        }
        else
            System.out.println(usuario +" não pode sacar dinheiros!");
    }
    
    public void mostraSaldo(){
        System.out.println("Conta possui R$" + saldo + " dinheiros!");
    }
    

}
