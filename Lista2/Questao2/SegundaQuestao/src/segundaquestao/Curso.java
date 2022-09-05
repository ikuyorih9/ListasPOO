package segundaquestao;

public class Curso {
    private String nome;
    private Turma turmas[] = new Turma[30];
    private int numTurmas;
    
    
    public Curso(String nome){
        this.nome = nome;
        numTurmas = 0;
    }
    
    public void criarTurma(String nome){
        Turma t = new Turma(nome);
        turmas[numTurmas] = t;
        numTurmas++;
    }
    
    public void matricularAluno(Aluno aluno, int turma){
        turmas[turma].matricular(aluno);
    }
    
    public void mostrarTurmas(){
        System.out.println("Turmas do curso " + nome + ":");
        for(int i = 0; i<numTurmas; i++){
            System.out.print((i+1) + ": ");
            turmas[i].mostrarNome();
            System.out.println();
        }
    }
}
