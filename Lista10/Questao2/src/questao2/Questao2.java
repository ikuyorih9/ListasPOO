package questao2;

public class Questao2 {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Usuario isaac = new Usuario("isaac", conta);
        Usuario hugo = new Usuario("hugo", conta);
        
        Thread t1 = new Thread(isaac);
        Thread t2 = new Thread(hugo);
        
        System.out.println("TESTE SEM VERIFICAR CONCORRENCIA!");
        System.out.println();
        
        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        
        conta.mostraSaldo();
        
        ContaBancaria_sincronizada conta_sinc = new ContaBancaria_sincronizada();
        isaac = new Usuario("isaac", conta_sinc);
        hugo = new Usuario("hugo", conta_sinc);
        Thread t3 = new Thread(isaac);
        Thread t4 = new Thread(hugo);
        
        System.out.println();
        System.out.println("TESTE VERIFICAR CONCORRENCIA!");
        System.out.println();
        
        t3.start();
        t4.start();
        
        try{
            t3.join();
            t4.join();
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        conta_sinc.mostraSaldo();
        
    }
    
}
