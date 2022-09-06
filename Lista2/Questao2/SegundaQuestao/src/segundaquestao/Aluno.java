package segundaquestao;

public class Aluno {
    private String nome;
    private String matricula;
    //private Matricula matricula = new Matricula();
    
    //CONSTRUTOR.
    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    
    //RETORNA NOME DO ALUNO.
    public String retornarNome(){
        return nome;
    }
    
    //RETORNA NUMERO DE MATRICULA DO ALUNO.
    public String retornarMatricula(){
        return matricula;
    }

}
