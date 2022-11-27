package questão2;


public class Questão2 {
    public static void main(String[] args) {
        //CRIA MATRIZ DINAMICA 10 X 10 ZERADA.
        MinhaMatrizDinamica m = new MinhaMatrizDinamica(10,10);
        
        //IMPRIME MATRIZ.
        m.imprimir();
        System.out.println();
        
        //ADICIONA 1 NO PAR (5,5).
        m.adicionar(5, 5, 1);
        m.imprimir();
        System.out.println();
        
        //PREENCHE A MATRIZ COM i+j.
        m.preencher();
        m.imprimir();
        
    }
    
}
