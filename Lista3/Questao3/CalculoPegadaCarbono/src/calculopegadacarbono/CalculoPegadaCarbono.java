package calculopegadacarbono;

import java.util.ArrayList;

public class CalculoPegadaCarbono {
    
    public static void main(String[] args){

        Carro carro1 = new Carro(1997, "Fiat", 50.0, "Gasolina", 2335.5, "Vermelho", 6);
        Carro carro2 = new Carro(2001, "Honda", 65.5, "Etanol", 1178.7, "Azul", 6);
        
        Bicicleta bicicleta1 = new Bicicleta(26, 12, "Caloi", "Preto", 1999);
        Bicicleta bicicleta2 = new Bicicleta(29, 6, "Caloi", "Amarelo", 2012);

        Casa casa1 =new Casa(58.5, 70, 7, 623, 1978, 6);
        Casa casa2 =new Casa(68.9, 95.5, 9, 725, 2005, 12.4);

        Escola escola1 = new Escola("MRV", 1991, 125, 185, 200, 25);
        Escola escola2 = new Escola("Cardinali", 2001, 143, 205, 340, 36.5);

        ArrayList <PegadaDeCarbono> lista = new ArrayList<PegadaDeCarbono>();

        lista.add(carro1);
        lista.add(carro2);
        lista.add(bicicleta1);
        lista.add(bicicleta2);
        lista.add(casa1);
        lista.add(casa2);
        lista.add(escola1);
        lista.add(escola2);
    

        for(int i = 0; i < lista.size(); i++) {
            System.out.println("Pegada de carbono " + lista.get(i).getClass().getSimpleName() + ": " +  lista.get(i).getPegadaDeCarbono() + " kg CO2");
        }
    }
}