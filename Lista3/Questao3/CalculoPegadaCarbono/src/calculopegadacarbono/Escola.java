package calculopegadacarbono;

import java.util.Calendar;

public class Escola extends Predio {
    
    Escola(String construtora, int anoCanstrucao, double areaConstruida, double areaTerreno, int numAlunos, double areaVerde){

        this.areaTerreno = areaTerreno;
        this.construtora = construtora;
        this.anoCanstrucao = anoCanstrucao;
        this.areaConstruida = areaConstruida;
        this.numAlunos = numAlunos;
        this.areaVerde = areaVerde;

    }

    //atributos
    String construtora; //nome da contrutora responsável pela obra
    int numAlunos;      //número total de alunos

    //metodos
    public String getConstrutora() {
        return construtora;
    }

    public double getPegadaDeCarbono(){
                
        //OBS: o calculo aqui realizado e ficticio

        double footPrint = 0;
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        footPrint = (anoAtual-anoCanstrucao)*((areaTerreno-areaConstruida-areaVerde)*2.34 + areaConstruida*3.47 - areaVerde*1.79) + numAlunos*2.12;

        return footPrint/1000;
        
    }
}