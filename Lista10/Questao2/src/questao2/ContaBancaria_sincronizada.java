package questao2;

public class ContaBancaria_sincronizada {
    private int saldo;
    private boolean calculando;
    
    public ContaBancaria_sincronizada(){
        saldo = 0;
        calculando = false;
    }
    
    synchronized public void depositar(int valor, String usuario){
        if(calculando){
            try{
                //Espera a execução das operações na conta por outro usuário.
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        calculando = true;
        if(valor > 0){
            saldo += valor;
            System.out.println(usuario + " depositou R$" + valor + "!");
        }
        else
            System.out.println(usuario +" tá tentando depositar o que fofo!?");
        calculando = false;
        notify();
    }
    
    synchronized public void sacar(int valor, String usuario){
        if(calculando)
            try{
                //Espera a execução das operações na conta por outro usuário.
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        
        calculando = true;
        
        if(saldo - valor >= 0){
            saldo -= valor;
            System.out.println(usuario + " sacou R$" + valor + "!");
        }
        else
            System.out.println(usuario +" não pode sacar dinheiros!");
        calculando = false;
        notify();
    }
    
    public void mostraSaldo(){
        System.out.println("Conta possui R$" + saldo + " dinheiros!");
    }
}
