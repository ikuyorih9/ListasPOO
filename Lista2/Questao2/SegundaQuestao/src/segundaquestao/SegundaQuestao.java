package segundaquestao;

public class SegundaQuestao {
    
    public static void main(String[] args) {
        //CRIA DOIS CURSOS.
        Curso informatica = new Curso("Informatica");
        Curso metrologia = new Curso("Metrologia");
        
        //CRIA A TURMA 2022001.
        informatica.criarTurma("2022001");
        metrologia.criarTurma("2022011");
        
        //MOSTRA AS TURMAS.
        informatica.listarTurmas();
        metrologia.listarTurmas();
        
        //CRIA ALUNO "HUGO"
        Aluno h = new Aluno("Hugo", "12732037");
        //CRIA ALUNO "GABRIEL"
        Aluno g = new Aluno("Gabriel", "12730000");
        
        //MATRICULA "HUGO" EM INFORMATICA.
        informatica.matricularAluno(h, "2022001");
        //MATRICULA "GABRIEL" EM METROLOGIA.
        metrologia.matricularAluno(g, "2022011");
        
        //MOSTRAR MATRICULADOS.
        informatica.listarAlunos("2022001");
        metrologia.listarAlunos("2022011");
        
        //VERIFICAR STATUS DO CURSO.
        informatica.mostrarStatus();
        
        //SOLICITA INICIO DO CURSO.
        informatica.iniciarCurso();
        
        //ADICIONAR MAIS 9 ALUNOS EM INFORMATICA.
        Aluno a1 = new Aluno("Abner", "12730001");
        Aluno a2 = new Aluno("Bruno", "12730002");
        Aluno a3 = new Aluno("Caio", "12730003");
        Aluno a4 = new Aluno("Daniel", "12730004");
        Aluno a5 = new Aluno("Ernesto", "12730005");
        Aluno a6 = new Aluno("Fernando", "12730006");
        Aluno a7 = new Aluno("Guilherme", "12730007");
        Aluno a8 = new Aluno("Henrique", "12730008");
        
        informatica.matricularAluno(a1, "2022001");
        informatica.matricularAluno(a2, "2022001");
        informatica.matricularAluno(a3, "2022001");
        informatica.matricularAluno(a4, "2022001");
        informatica.matricularAluno(a5, "2022001");
        informatica.matricularAluno(a6, "2022001");
        informatica.matricularAluno(a7, "2022001");
        informatica.matricularAluno(a8, "2022001");
        informatica.matricularAluno(g, "2022001");
        
        //MOSTRAR MATRICULADOS
        informatica.listarAlunos("2022001");
        
        //SOLICITA INICIO DO CURSO.
        informatica.iniciarCurso();
        
        //VERIFICAR STATUS DO CURSO.
        informatica.mostrarStatus();
        
        //TENTA CRIAR TURMA QUE JA EXISTE.
        informatica.criarTurma("2022001");
        informatica.listarTurmas();
        
        //TENTA MATRICULAR ALUNO NOVAMENTE.
        informatica.matricularAluno(a8, "2022001");

        
        
        
    }
    
}
