package segundaquestao;

public class Turma {
    private String nome;
    private Aluno alunos[] = new Aluno[50];
    private int numMatriculados;
    
    //CONSTRUTOR.
    public Turma(String nome){
        this.nome = nome;
        numMatriculados = 0;
    }
    
    //MATRICULA UM ALUNO 'aluno' NA TURMA.
    public void matricular(Aluno aluno){
        if(procurarAluno(aluno.retornarNome()) == -1){
            alunos[numMatriculados] = aluno;
            numMatriculados++;
        }
        else
            System.out.println("Aluno "+aluno.retornarNome()+" ja matriculado!");
    }
    
    //LISTA TODAS AS MATRICULAS DA TURMA.
    public void listarMatriculas(){
        for(int i = 0; i<numMatriculados; i++){
            System.out.print("Aluno: " + alunos[i].retornarNome());
            System.out.println(", Matricula: " + alunos[i].retornarMatricula());
        }
    }
    
    //RETORNA NOME DA TURMA.
    public String retornarNome(){
        return nome;
    }
    
    //RETORNA NUMERO DE MATRICULADOS NA TURMA.
    public int retornarNumMatriculados(){
        return numMatriculados;
    }
    
    //RETORNA INDICE DO ALUNO, SE ELE ESTIVER NA TURMA.
    private int procurarAluno(String nome){
        for(int i = 0; i< numMatriculados; i++){
            if(alunos[i].retornarNome() == nome)
                return i;
        }
        return -1;
    }
    
}
