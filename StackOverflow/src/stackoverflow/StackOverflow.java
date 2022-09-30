package stackoverflow;
/*
    Explicação: Uma vez que os objetos e arrays nunca são colocados na puilha,
seria difícil gerar um StackOverflow empilhando variáveis. Porém, as chamadas 
de um método são emplhadas pela linguagem na stack. Assim, a estratégia aqui 
utilizada é forçar o erro empilhando várias chamadas recursivas de um método 
associado ao meu objeto, até que uma excessão do tipo "java.lang.StackOverflowError" 
seja lançada.

*/
public class StackOverflow {

    public static void main(String[] args) {
       
        /*
        [...]
        */
        
        MyObject obj = new MyObject();
        obj.MyMethod();//inicia a recursão que irá gerar a excessão de StackOverflow
        
        /*
        [...]
        */
        
    }
    
}
