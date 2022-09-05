
import java.util.*;

/**
 * 
 */
public class Dispositivo_de_Rede extends Drivers {

    /**
     * Default constructor
     */
    public Dispositivo_de_Rede() {
        this.conectado=false;
        this.sinal=0;
        this.velocidade_download=0;
        this.velocidade_upload=0;
    }

    /**
     * 
     */
    private boolean conectado;

    /**
     * 
     */
    private int sinal;

    /**
     * 
     */
    private int velocidade_download;

    /**
     * 
     */
    private int velocidade_upload;

    /**
     * @return
     */
    public boolean enviaPacoteDeDados() {
        if(sinal>0){
            return true;
        }
        return false;
    }

    /**
     * @return
     */
    public boolean recebePacoteDeDados() {
        if(sinal>0){
            return true;
        }
        return false;
    }

    /**
     * @return
     */
    public String medirVelocidadeInternet() {
        String velocidades="Download:"+this.velocidade_download+"Upload:"+this.velocidade_upload;
        return velocidades;
    }

}