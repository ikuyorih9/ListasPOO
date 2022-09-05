package segundaquestao;

public class SegundaQuestao {
    
    public static void main(String[] args) {
        //CRIAR UM CURSO;
        Curso informatica = new Curso("Informatica");
          
        //CRIAR UMA TURMA PRO CURSO;
        informatica.criarTurma("2022001");
        informatica.mostrarTurmas();

        //CRIAR UM ALUNO;
        Aluno h = new Aluno("Hugo");
        h.fazerMatricula("12732037");
        h.mostrarNome();
        System.out.println();
        h.mostrarMatricula();
        System.out.println();
        
        //ADICIONA ALUNO NA TURMA.
        informatica.matricularAluno(h, 0);
        
        
        
        
        
    }
    
}
