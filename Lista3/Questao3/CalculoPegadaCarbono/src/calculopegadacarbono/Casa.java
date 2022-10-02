package calculopegadacarbono;

import java.util.Calendar;

public class Casa extends Predio {

    Casa(double areaConstruida, double areaTerreno, int qtdComodos, int numCasa, int anoCanstrucao, double areaVerde){

        this.areaTerreno = areaTerreno;
        this.areaConstruida = areaConstruida;
        this.numCasa = numCasa;
        this.qtdComodos = qtdComodos;
        this.anoCanstrucao = anoCanstrucao;
        this.areaVerde = areaVerde;

    }

    //atributos
    int qtdComodos;
    int numCasa;

    //metodos
    public void aumentarNumComodos(int qtdNovosComodos){
        qtdComodos = qtdComodos + qtdNovosComodos;
    }

    public int getQtdComodos(){
        return qtdComodos;
    }

    public int getNumCasa(){
        return numCasa;
    }

    public double getPegadaDeCarbono(){
               
        //OBS: o calculo aqui realizado e ficticio

        double footPrint = 0;
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        footPrint = (anoAtual-anoCanstrucao)*((areaTerreno-areaConstruida-areaVerde)*2.34 + areaConstruida*3.47 - areaVerde*1.79);

        return footPrint/1000;
        
    }
}