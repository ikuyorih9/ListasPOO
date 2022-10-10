package questão2;

public class MeuVetorDinamico {
    private int [] dados; // ponteiro - vai para a heap, pois fara parte de um objeto
    private int tamanho;  // atributo de tipo primitivo - vai para a heap, pois fara parte de um objeto
    
    MeuVetorDinamico(int tamanho) {
        dados = new int[tamanho]; // aloca vertor dinamicamente na heap
        this.tamanho = tamanho;
        zerar(); // zera todo o vetor
    }
    
    public void setaValor(int p, int v) throws ArrayIndexOutOfBoundsException {
        if (p < 0 || p >= tamanho)
            throw new ArrayIndexOutOfBoundsException("Indice invalido.");
        dados[p] = v;
    }
    
    public int getValor(int p) throws ArrayIndexOutOfBoundsException {
        if (p < 0 || p >= tamanho)
            throw new ArrayIndexOutOfBoundsException("Indice invalido.");
        return dados[p];
    }
    
    private void zerar() {
        for (int i = 0; i < tamanho; i++)
            dados[i] = 0;
    }
    
    public void preenche() {
        for (int i = 0; i < tamanho; i++)
            dados[i] = i * 10;
    }
    
    public void imprime() {
        for (int i = 0; i < tamanho; i++)
            if (i < tamanho - 1)
                System.out.print(dados[i] + ", ");
            else
                System.out.println(dados[i]);
    }
}
