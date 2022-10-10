package questão2;
/*
    2) Escreva em Java a classe MinhaMatrizDinamica que representa uma matriz alocada na heap. A área de memória 
alocada deve ser definida em função do número de linhas e do número de colunas da matriz. Estes são informados 
ao construtor MinhaMatrizDinamica(int numLinhas, int numColunas), o qual faz a alocação e preenche a matriz 
com zeros. Escreva ainda métodos para: 
    a) preencher uma posição [i, j] da matriz com um valor v, em que i, j e v 
são recebidos por parâmetro;
    b) preencher a matriz toda de uma vez, de forma que cada posição [i, j] receba o valor 
i + j; e 
    c) imprimir a matriz. 
*/

public class MinhaMatrizDinamica {

    private int [][] matriz;
    private int numLinhas;
    private int numColunas;
    
    //ALOCA A MATRIZ DINAMICAMENTE.
    public MinhaMatrizDinamica(int numLinhas, int numColunas){
        matriz = new int[numLinhas][numColunas];
        this.numLinhas = numLinhas;
        this.numColunas = numColunas;
        zerarMatriz();
    }
    
    //PREENCHE A MATRIZ COM ZEROS.
    public void zerarMatriz(){
        for(int i = 0; i < numLinhas; i++){
            for(int j = 0; j < numColunas; j++){
                matriz[i][j] = 0;
            }
        }
    }
    
    //ADICIONA UM VALOR valor NO PAR (i,j).
    public void adicionar(int i, int j, int valor) throws ArrayIndexOutOfBoundsException{
        if(i >= numLinhas || j >= numColunas || i < 0 || j < 0)
            throw new ArrayIndexOutOfBoundsException("Indice invalido!");
        matriz[i][j] = valor;
    }
    
    //PREENCHE A MATRIZ COM i+j A CADA i E j.
    public void preencher(){
        for(int i = 0; i < numLinhas; i++){
            for(int j = 0; j < numColunas; j++){
                matriz[i][j] = i+j;
            }
        }
    }
    
    //IMPRIME A MATRIZ.
    public void imprimir(){
        for(int i = 0; i < numLinhas; i++){
            for(int j = 0; j < numColunas; j++){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    
}
