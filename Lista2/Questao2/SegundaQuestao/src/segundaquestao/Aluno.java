package segundaquestao;

public class Aluno {
    private String nome;
    private Matricula matricula = new Matricula();
    
    public Aluno(String nome){
        this.nome = nome;
    }
    public void fazerMatricula(String idMatricula){
        matricula.adicionarID(idMatricula);
    }
    public void mostrarNome(){
        System.out.print(nome);
    }
    public void mostrarMatricula(){
        matricula.mostrarID();
    }

}
