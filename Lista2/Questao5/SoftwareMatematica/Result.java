
import java.util.*;
import java.text.*;

public class Result {

    
    public Result( Date Data, User Usuario, float ResOp, String TipoOp) {

        this.Data = Data;
        this.Usuario = Usuario;
        this.ResOp = ResOp;
        this.TipoOp = TipoOp;

    }

    private Date Data;
    private User Usuario;
    private float ResOp;
    private String TipoOp;

    public void Mostra() {

        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("\nResultado da Operacao: %f", ResOp);
        System.out.printf("\nUsuario que solicitou a operacao:\n\tNome: %s\n\tIdade: %d Anos\n\t", Usuario.getUserName(), Usuario.getUserAge());
        System.out.printf("Foto:\n\t\tPath: %s\n\t\tData: %s", Usuario.getUserPhoto().getPath(), dtf.format(Usuario.getUserPhoto().getData()));
        //System.out.println("Foto:\n\t\tPath:" + Usuario.getUserPhoto().getPath() + "\n\t\tData:" + dtf.format(Usuario.getUserPhoto().getData()));
        System.out.printf("\nTipo da Operacao: %s", TipoOp);
        System.out.printf("\nData da Operacao: ");
        System.out.println(dtf.format(Data) + "\n");

        
    }

}