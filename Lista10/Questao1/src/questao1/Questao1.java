package questao1;

public class Questao1 {

    public static void main(String[] args) {
       
        //números de unidades do produto a serem fabricadas
        int totalUnidades = 100000; 
        String [] nomes = {"Consumidor1", "Consumidor2", "Consumidor3", "Consumidor4", "Consumidor5"};
                
        //criação do objeto depósito e da thread de produtor
        Deposito<Integer> deposito = new Deposito();
        Thread tProdutor = new Thread(new Produtor("Produtor", deposito, totalUnidades));
        
        //criação das threads dos consumidores
        Consumidor [] Consumidores = new Consumidor[nomes.length];
        Thread [] tConsumidores = new Thread[nomes.length];
        
        for (int i = 0; i < nomes.length; i++) {
            Consumidores[i] = new Consumidor(nomes[i], deposito);
            tConsumidores[i] = new Thread(Consumidores[i]);
        }
        
        //inicia a thread do produtor
        tProdutor.start(); 
        
        //inicia as threads dos consumidores
        for (int i = 0; i < nomes.length; i++){
            tConsumidores[i].start(); 
        }
        
        //espera o fim da producao 
        try {
            tProdutor.join();
            //espera o fim do consumo por parte de todos os consumidores
            for (int i = 0; i < nomes.length; i++)
                tConsumidores[i].join(); 
        } catch(InterruptedException e) {
            System.out.println("ERRO:" + e.getMessage());
        }
        
        //imprime o consumo de cada um dos consumidores
        for (int i = 0; i < nomes.length; i++){
            System.out.println("O " + nomes[i] + " consumiu " + Consumidores[i].getUnidadesConsumido());
        }
        
        System.out.println(); 
        
        //verifica e imprime quam mais consumiu
        int Maior = 0;
        for (int i = nomes.length-1; i > 0; i--){
            
            //se o consumidor corrente consumiu mais que o consumidor salvo como "Maior",
            //o valor da variável é, então, atualizado
            if (Consumidores[i].getUnidadesConsumido() > Consumidores[Maior].getUnidadesConsumido()){
                Maior = i;
            }
        }
        
        System.out.println("Quem mais consumiu foi " + nomes[Maior] + ", com " + Consumidores[Maior].getUnidadesConsumido() + " unidades consumidas");
        
        }
    
}
