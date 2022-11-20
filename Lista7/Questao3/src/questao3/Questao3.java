package questao3;

public class Questao3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArvBB<String> nome = new ArvBB();
        nome.inserir("Daniel");
        nome.inserir("Gabriel");
        nome.inserir("Guilherme");
        nome.inserir("Hugo");
        if (nome.buscar("Hugo")){
            System.out.println("Hugo esta na arvore");
        }
        else{
            System.out.println("Hugo NAO esta na arvore");
        }
        nome.imprimirEmOrdem();
        nome.remover("Gabriel");
        nome.imprimirEmOrdem();
    }
}

