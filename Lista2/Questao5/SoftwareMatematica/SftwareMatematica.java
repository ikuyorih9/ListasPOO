import java.util.*;
import java.text.*;

public class SftwareMatematica {

    public static void main(String[] args) {  

        //criacao dos objetos necessarios para armazenar as infos de um usuario
        Scanner s = new Scanner(System.in);
        String Nome = new String();
        String Path =  new String();
        String DataStr = new String();
        Date Data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int Idade = 0;        

        //entrada dos dados para a criacao de um usuario
        System.out.println("Seja bem vindo!");
        System.out.println("Digite seu nome:");
        Nome = s.next();
        System.out.println("Digite sua idade em anos:");
        Idade = s.nextInt();
        System.out.println("Insira a path para sua foto:");
        Path = s.next();
        System.out.println("Insira a data da sua foto no formato dd/MM/yyyy");
        DataStr = s.next();
        
        //ajeitar esse trecho
        //realiza a conversao da data no formato string para o formato date
        boolean dtFormatIncorrect = true;
        while (dtFormatIncorrect) {
            try {
                Data = sdf.parse(DataStr);
                dtFormatIncorrect = false;
            } catch (ParseException e) {
                System.out.println("ERRO: a data inserida apresenta formato invalido");
                dtFormatIncorrect = true;
            }            
        }
        
        User Usuario = new User(Nome, Idade, Data, Path);
        
        //inserir menu que exibe opcoes de operacoes

        int Opcao = 0;
        float var1 = 0;
        float var2 = 0;

        while(true) {

            System.out.println("Escolha uma Operacao:\n\t1 - Adicao\n\t2 - Subtracao\n\t3 - Multiplicacao\n\t4 - Divisao\n\t5 - Sair");
            Opcao = s.nextInt();

            if(Opcao == 5)
                break;
            
            System.out.println("Digite os dois Operandos a seguir:");
            var1 = s.nextFloat();
            var2 = s.nextFloat();

            switch (Opcao) {

                case 1:
                    
                    Add Adicao = new Add();
                    Usuario.SolicitarOperacao(var1, var2, Adicao);
                    break;
                
                case 2:
                    
                    Sub Subtracao = new Sub();
                    Usuario.SolicitarOperacao(var1, var2, Subtracao);
                    break;
                
                case 3:
                    
                    Mul Multiplicacao = new Mul();
                    Usuario.SolicitarOperacao(var1, var2, Multiplicacao);
                    break;

                case 4:
                    
                    Div Divisao = new Div();
                    Usuario.SolicitarOperacao(var1, var2, Divisao);
                    break;

                default:

                    System.out.println("Opcao Invalida!");
                    break;

            }

        }
        
        s.close();

    }
    
}
