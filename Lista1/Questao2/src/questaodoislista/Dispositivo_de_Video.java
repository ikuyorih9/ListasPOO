package questaodoislista;
import java.util.*;

public class Dispositivo_de_Video extends Drivers {

    public Dispositivo_de_Video(int r_vertical,int r_horizontal, boolean hdr) {
        this.brilho=50;
        this.resolucao_vertical=r_vertical;
        this.resolucao_horizontal=r_horizontal;
        this.hdr=hdr;
    }

    private int brilho;

    private int resolucao_vertical;

    private int resolucao_horizontal;

    private boolean hdr;

    public void alteraBrilhoDeExibicao(int brilho) {
        this.brilho=brilho;
        return;
    }

    public void alteraResolucao(int r_vertical, int r_horizontal) {
        this.resolucao_vertical=r_vertical;
        this.resolucao_horizontal=r_horizontal;
        return;
    }

    public String retornaEspecificacoes() {
        String specs="resoluçaõ_horizontal:"+this.resolucao_horizontal+"resolução_vertical:"+this.resolucao_vertical+"hdr:"+this.hdr;
        return specs;
    }

}