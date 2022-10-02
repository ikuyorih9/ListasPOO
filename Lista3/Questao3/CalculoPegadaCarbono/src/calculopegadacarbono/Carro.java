package calculopegadacarbono;

import java.util.Calendar;

public class Carro implements PegadaDeCarbono {

    //construtor
    Carro(int anoFabricacao, String marca, double capacidadeTanque, String tipoCombustivel, double KMrodados, String cor, int marchas){

        this.tipoCombustivel = tipoCombustivel;
        this.KMrodados = KMrodados;
        this.anoFabricacao = anoFabricacao;
        this.capacidadeTanque = capacidadeTanque;
        this.marca = marca;
        this.cor = cor;
        this.marchas = marchas;

    }

    //atributos
    int anoFabricacao;
    String marca;
    double capacidadeTanque;
    String tipoCombustivel;
    double KMrodados;
    String cor;
    int marchas;

    //metodos
    public int getMarchas(){
        return marchas;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public double getCapacidadeTanque(){
        return capacidadeTanque;
    }

    public String getTipoCombustivel(){
        return tipoCombustivel;
    }

    public double getKMrodados(){
        return KMrodados;
    }

    public String getCor(){
        return cor;
    }

    public double getPegadaDeCarbono(){

        //OBS: o calculo aqui realizado e ficticio

        double footPrint = 0;
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        double fatorEmissaoCombustivel;

        if(tipoCombustivel == "Etanol"){
            
            fatorEmissaoCombustivel = 2.35;

        }else if(tipoCombustivel == "Gasolina"){

            fatorEmissaoCombustivel = 4.57;

        } else{
            
            fatorEmissaoCombustivel = 1.76;
        }

        footPrint = KMrodados*fatorEmissaoCombustivel + (anoAtual-anoFabricacao)*3.6;

        return footPrint/1000; 
    }

}