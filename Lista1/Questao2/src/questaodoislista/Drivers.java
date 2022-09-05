
import java.util.*;

/**
 * 
 */
public class Drivers extends Drivers {

    /**
     * Default constructor
     */
    public Drivers() {
        this.status="desligado";
    }

    /**
     * 
     */
    private String status;

    /**
     * @return
     */
    public void ligaDispositivo() {
        this.status="ligado";
        return;
    }

    /**
     * @return
     */
    public void desligaDispositivo() {
        this.status="desligado";
        return;
    }

    /**
     * @return
     */
    public String verificaStatus() {
        return this.status;
    }

    /**
     * @return
     */
    public int executaTeste() {
        return 0;
    }

}