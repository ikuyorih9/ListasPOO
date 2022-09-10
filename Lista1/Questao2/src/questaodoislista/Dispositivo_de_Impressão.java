package questaodoislista;
import java.util.*;

public class Dispositivo_de_Impressão extends Drivers {

    public Dispositivo_de_Impressão(int p, int c) {
        this.nivel_tinta_preta=p;
        this.nivel_tinta_colorida=c;
        this.tem_papel=true;
    }

    private int nivel_tinta_preta;

    private int nivel_tinta_colorida;

    private boolean tem_papel;

    public boolean imprimePaginas() {
        if(tem_papel==true && (nivel_tinta_colorida>0 || nivel_tinta_preta>0)){
            return true;
        }
        return false;
    }

    public boolean recarregaTinta(String cor) {
        if(cor=="preta"){
            this.nivel_tinta_preta=100;
        }
        else{
            this.nivel_tinta_colorida=100;
        }
        return true;
    }

    public String mostraNivelTintas() {
        String tintas="Preta:"+this.nivel_tinta_preta+"% "+"Colorida:"+this.nivel_tinta_colorida+"%";
        return tintas;
    }

}