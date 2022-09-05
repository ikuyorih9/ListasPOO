package segundaquestao;

public class Turma {
    private String nome;
    private Aluno alunos[] = new Aluno[50];
    private int numMatriculados;
    
    public Turma(String nome){
        this.nome = nome;
        numMatriculados = 0;
    }
    
    public void matricular(Aluno aluno){
        alunos[numMatriculados] = aluno;
    }
    public void mostrarMatriculas(){
        for(int i = 0; i<numMatriculados; i++){
            System.out.print("Aluno: ");
            alunos[i].mostrarNome();
            System.out.print(", Matricula: ");
            alunos[i].mostrarMatricula();
        }
    }
    public void mostrarNome(){
        System.out.print(nome);
    }
}
