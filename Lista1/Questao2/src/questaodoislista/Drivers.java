package questaodoislista;
import java.util.*;

public class Drivers {

    public Drivers() {
        this.status="desligado";
    }

    private String status;

    public void ligaDispositivo() {
        this.status="ligado";
        return;
    }

    public void desligaDispositivo() {
        this.status="desligado";
        return;
    }

    public String verificaStatus() {
        return this.status;
    }

    public int executaTeste() {
        return 0;
    }

}