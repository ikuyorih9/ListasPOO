package questao2;

public class Questao2 {
    
    public static <TIPO extends Comparable> void insertionSort(TIPO [] A) {
        int i, j;
        TIPO temp;
        for (j = 1; j < A.length; j++) {
            temp = A[j];
            i = j - 1;
            while (i > -1 && A[i].compareTo(temp) > 0) {
                A[i + 1] = A[i];
                i -= 1;
            }
            A[i + 1] = temp;
        }
    }
    
    public static void ordenaRG(Pessoa pessoas[]){
        int i, j;
        Pessoa temp;
        for (j = 1; j < pessoas.length; j++) {
            temp = pessoas[j];
            i = j - 1;
            while (i > -1 && pessoas[i].compareTo(temp) > 0) {
                pessoas[i + 1] = pessoas[i];
                i -= 1;
            }
            pessoas[i + 1] = temp;
        }
    }
    
    public static void main(String[] args) {
        Integer [] vetorInteiro = new Integer[5];
        vetorInteiro[0] = 10;
        vetorInteiro[1] = 5;
        vetorInteiro[2] = 20;
        vetorInteiro[3] = 15;
        vetorInteiro[4] = 1;
        
        insertionSort(vetorInteiro);
        
        // imprime vetor
        System.out.print("[");
        for (int i = 0; i < 4; i++)
            System.out.print(vetorInteiro[i] + ", ");
        System.out.println(vetorInteiro[4] + "]");
        
        // monta vetor
        String [] vetorString = new String[5];
        vetorString[0] = "Maria";
        vetorString[1] = "Pedro";
        vetorString[2] = "Alice";
        vetorString[3] = "Joao";
        vetorString[4] = "Ana";
        
        insertionSort(vetorString);
        
        System.out.print("[");
        for (int i = 0; i < 4; i++)
            System.out.print(vetorString[i] + ", ");
        System.out.println(vetorString[4] + "]");
        
        Pessoa pessoas[] = new Pessoa[10];
        pessoas[0] = new Pessoa("Hugo", 12613);
        pessoas[1] = new Pessoa("Gabriel", 12412);
        pessoas[2] = new Pessoa("Guilherme", 35233);
        pessoas[3] = new Pessoa("Daniel", 56324);
        pessoas[4] = new Pessoa("Robson", 12315);
        pessoas[5] = new Pessoa("Nicholas", 35116);
        pessoas[6] = new Pessoa("Isac", 18543);
        pessoas[7] = new Pessoa("Felipe", 24221);
        pessoas[8] = new Pessoa("Mateus", 12413);
        pessoas[9] = new Pessoa("Joao", 21924);
        
        System.out.println("PESSOAS DESORDENADAS:");
        for(int i = 0; i < 10; i++){
            pessoas[i].imprimePessoa();
        }
        
        ordenaRG(pessoas);
        
        System.out.println();
        System.out.println("PESSOAS ORDENADAS:");
        for(int i = 0; i < 10; i++){
            pessoas[i].imprimePessoa();
        }  
        
    }
    
}
