
import java.util.*;

/**
 * 
 */
public class Dispositivo_de_Impressão extends Drivers {

    /**
     * Default constructor
     */
    public Dispositivo_de_Impressão(int p, int c) {
        this.nivel_tinta_preta=p;
        this.nivel_tinta_colorida=c;
        this.tem_papel=true;
    }

    /**
     * 
     */
    private int nivel_tinta_preta;

    /**
     * 
     */
    private int nivel_tinta_colorida;

    /**
     * 
     */
    private boolean tem_papel;

    /**
     * @return
     */
    public boolean imprimePaginas() {
        if(tem_papel==true && (nivel_tinta_colorida>0 || nivel_tinta_preta>0)){
            return true;
        }
        return false;
    }

    /**
     * @param cor 
     * @return
     */
    public boolean recarregaTinta(string cor) {
        if(cor=="preta"){
            this.nivel_tinta_preta=100;
        }
        else{
            this.nivel_tinta_colorida=100;
        }
        return true;
    }

    /**
     * @return
     */
    public String mostraNivelTintas() {
        String tintas="Preta:"+this.nivel_tinta_preta+"% "+"Colorida:"+this.nivel_tinta_colorida+"%";
        return tintas;
    }

}