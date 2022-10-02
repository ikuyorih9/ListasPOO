package calculopegadacarbono;
import java.util.Calendar;

public class Bicicleta implements PegadaDeCarbono {

    //construtor
    Bicicleta(int aro, int marchas, String marca, String cor, int anoFabricacao){

        this.aro = aro;
        this.marca = marca;
        this.marchas = marchas;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;

    }

    //atributos
    int aro; //numeracao do aro da bicicleta;
    int marchas; //quantidade de marchas
    String marca; //nome do fabricante
    float vel; //indica a velocidade da bicicleta 
    String cor; //indica a cor da bicicleta
    int anoFabricacao; //ano da fabricacao da bicicleta

    //metodos
    public int getAro() {
        return aro;
    }

    public String getMarca() {
        return marca;
    }

    public int getMarchas() {
        return marchas;
    }

    public void MudarCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public double getPegadaDeCarbono(){
        
        //OBS: o calculo aqui realizado e ficticio

        double footPrint = 0;
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        footPrint = (anoAtual-anoFabricacao)*1.8;

        return footPrint/1000; 

    }
  
}