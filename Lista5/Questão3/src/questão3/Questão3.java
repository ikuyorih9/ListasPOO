package questão3;

public class Questão3 {
    public static void main(String[] args) {
        MinhaListaEncadeada list = new MinhaListaEncadeada();

        list.insereFim(10);
        list.insereFim(30);
        list.insereFim(65);
        list.insereFim(99);

        list.insere_n_elementos_Fim(5);

        list.remove(65);

        list.imprime();
    }
}
