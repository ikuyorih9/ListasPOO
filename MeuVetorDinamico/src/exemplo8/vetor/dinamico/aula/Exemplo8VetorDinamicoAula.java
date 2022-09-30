package exemplo8.vetor.dinamico.aula;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exemplo8VetorDinamicoAula {

    public static void main(String[] args) {
               
        try {
            //le tamanho
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Digite o tamanho: ");
            int tamanho = Integer.valueOf(buffer.readLine());
            
            // cria vetor
            MeuVetorDinamico v = new MeuVetorDinamico(tamanho);
            
           
            int op = 0;
            boolean sair = false;

            while(!sair){
                //imprimir um menu
                System.out.print("Escolha uma opcao: ");
                op = Integer.valueOf(buffer.readLine());
                switch(op){
                    
                    case 1:
                        v.preenche();
                        break;
                    
                    case 2:
                        //pedir para o usurario digitar um valor
                        v.setaValor(1, 20);
                        break;
                        
                    case 3:
                        v.imprime();
                        break;
                    
                    case 4:
                        sair = true;
                        break;
                }
            }

        }
        catch(IOException e) {
            System.out.println("Erro ao ler do teclado. Detalhes: " + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao invalida. Detalhes: " + e.getMessage());
        }
        
        System.out.println("Fim.");
    }
    
}
