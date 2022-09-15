import java.util.Date;

public class User {

    
    public User(String Nome, int Idade, Date Data, String Path) {

        this.Nome = Nome;
        this.Idade = Idade;
        this.Foto = new Photo(Data, Path);

    }

    private String Nome;
    private int Idade;
    private Photo Foto;

    public String getUserName() {
        return Nome;
    }

    public int getUserAge() {
        return Idade;
    }

    public Photo getUserPhoto() {
        return Foto;
    }

    public void SolicitarOperacao(float var1, float var2, Operacao Op) {

        float ResOP = 0;
        ResOP = Op.RealizarOperacao(var1, var2);

        Date Data = new Date();
        Result Resultado = new Result(Data, this, ResOP, Op.getClass().getSimpleName()); 
        Resultado.Mostra();

    }

}