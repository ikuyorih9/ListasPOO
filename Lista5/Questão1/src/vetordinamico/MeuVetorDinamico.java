package vetordinamico;

import java.lang.ArrayIndexOutOfBoundsException;

public class MeuVetorDinamico {
    private int [] dados; // ponteiro - vai para a heap, pois fara parte de um objeto
    private int tamanho;  // atributo de tipo primitivo - vai para a heap, pois fara parte de um objeto
    
    MeuVetorDinamico(int tamanho) {
        dados = new int[tamanho]; // aloca vertor dinamicamente na heap
        this.tamanho = tamanho;
        zerar(); // zera todo o vetor
    }
    
    public void setaValor(int pos, int valor) throws ArrayIndexOutOfBoundsException {
        if (pos < 0 || pos >= tamanho)
            throw new ArrayIndexOutOfBoundsException("Indice invalido.");
        dados[pos] = valor;
    }
    
    private void zerar() {
        for (int i = 0; i < tamanho; i++)
            dados[i] = 0;
    }
    
    public void preenche() {
        for (int i = 0; i < tamanho; i++)
            dados[i] = i * 100;
    }
    
    public void imprime() {
        
        System.out.print("Vetor: ");
        for (int i = 0; i < tamanho; i++)
            if (i < tamanho - 1)
                System.out.print(dados[i] + ", ");
            else
                System.out.println(dados[i]);
    }

}
