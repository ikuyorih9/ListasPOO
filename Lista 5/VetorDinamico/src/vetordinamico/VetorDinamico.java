package vetordinamico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VetorDinamico {

    public static void main(String[] args) {
        
        try {
            //le tamanho do vetor a ser criado
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Digite o tamanho do vetor: ");
            int tamanho = Integer.valueOf(buffer.readLine());
            
            // cria vetor
            MeuVetorDinamico v = new MeuVetorDinamico(tamanho);
            
           //declaracao de variaveis
            int op = 0;
            int valor = 0;
            int pos = 0;
            boolean sair = false;
            
            //impressao do "menu"
            System.out.println("1 - Preencher ");
            System.out.println("2 - Setar valor ");
            System.out.println("3 - Imprimir ");
            System.out.println("4 - Sair ");
                
            while(!sair){
                
                System.out.print("Escolha uma opcao: ");
                op = Integer.valueOf(buffer.readLine());
                switch(op){
                    
                    case 1:
                        v.preenche();
                        break;
                    
                    case 2:
                        System.out.print("Digite o valor: ");
                        valor = Integer.valueOf(buffer.readLine());
                        System.out.print("Digite a posicao: ");
                        pos = Integer.valueOf(buffer.readLine());
                        v.setaValor(pos, valor);
                        break;
                        
                    case 3:
                        v.imprime();
                        break;
                    
                    case 4:
                        sair = true;
                        break;
                        
                    default:
                        System.out.println("Opcao invalida! Tente novamente");
                        break;
                }
            }

        }
        catch(IOException e) {
            System.out.println("Erro ao ler do teclado. Detalhes: " + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao invalida. Detalhes: " + e.getMessage());
        } finally{
             System.out.println("--Fim da execucao--");
        }
    }
    
}
