package segundaquestao;

public class Curso {
    private String nome;
    private Turma turmas[] = new Turma[30];
    private int numTurmas;
    private boolean status;//false: desativado, true: ativado.
    
    //CONSTRUTOR
    public Curso(String nome){
        this.nome = nome;
        numTurmas = 0;
        status = false;
    }
    
    //CRIA UMA NOVA TURMA.
    public void criarTurma(String nome){
        if(procurarTurma(nome) == -1){
            Turma t = new Turma(nome);
            turmas[numTurmas] = t;
            numTurmas++;
        }
        else
            System.out.println("Turma já existe!");
    }
    
    //MATRICULA UM ALUNO 'aluno' NA TURMA 'turma' DO CURSO.
    public void matricularAluno(Aluno aluno, String turma){
        int i = procurarTurma(turma);
        if(i != -1)
            turmas[i].matricular(aluno);
        else
            System.out.println("Turma nao encontrada!");
    }
    
    //LISTA TODOS AS TURMAS DO CURSO.
    public void listarTurmas(){
        System.out.println("Turmas do curso " + nome + ":");
        for(int i = 0; i<numTurmas; i++){
            System.out.println((i+1) + ": " + turmas[i].retornarNome());
        }
    }
    
    //LISTA TODOS OS ALUNOS DE UMA TURMA 'turma' DO CURSO.
    public void listarAlunos(String turma){
        int i = procurarTurma(turma);
        if(i != -1)
            turmas[i].listarMatriculas();
        else
            System.out.println("Turma nao encontrada!");
    }
  
    //MOSTRA STATUS DO CURSO.
    public void mostrarStatus(){
        if(status)
            System.out.println("Curso em andamento.");
        else
            System.out.println("Aguardando pedido de inicio.");
    }
    
    //INICIA CURSO, SE POSSIVEL.
    public void iniciarCurso(){
        status = true;
        int i;
        for(i = 0; i< numTurmas; i++){
            if(turmas[i].retornarNumMatriculados() < 10){
                status = false;
                break;
            }
        }
        
        if(status) 
            System.out.println("Curso iniciado!");
        else {
            System.out.println("Nao foi possivel iniciar o curso.");
        }
    }
    
    //RETORNA INDICE DA TURMA 'nome'.
    private int procurarTurma(String nome){
        for(int i = 0; i < numTurmas; i++){
            if(turmas[i].retornarNome() == nome){
                return i;
            }
        }
        return -1;
    }
            
}
