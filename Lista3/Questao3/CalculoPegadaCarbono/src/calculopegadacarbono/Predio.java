package calculopegadacarbono;

public abstract class Predio implements PegadaDeCarbono {

    //atributos
    double areaTerreno; //area total do terreno
    double areaConstruida; //area total construida
    int anoCanstrucao; //ano em que foi terminada a construção
    double areaVerde; //area com jardim etc, nao pavimentada

    public double getAreaConstruida(){
        return areaConstruida;
    }

    public double getAreaTerreno(){
        return areaTerreno;
    }


    public int getAnoConstrucao() {
        return anoCanstrucao;
    }

    public void expandirAreaConstruida(Double areaRecemConstruida){

        if(areaRecemConstruida < areaTerreno - areaConstruida){
            this.areaConstruida = areaRecemConstruida;
        }else{
            System.out.println("Valor inválido!");
        }

    }

    public abstract double getPegadaDeCarbono();
}