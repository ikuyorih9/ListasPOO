/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questao3;

/**
 *
 * @author ACER
 */
public class ArvBB <T extends Comparable> {
    private NoArv<T> raiz;
    
    ArvBB() {
        raiz = null;
    }
    
    ArvBB(T valor) {
        raiz = new NoArv<T>(valor, null, null);
    }
    
    private NoArv<T> inserirRec(NoArv<T> atual, T valor) {
        if (atual == null)
            atual = new NoArv<T>(valor, null, null); // novo no
        else
            if (atual.getValor().compareTo(valor) > 0)
                atual.setEsq(inserirRec(atual.getEsq(), valor)); // insere a esquerda
            else
                atual.setDir(inserirRec(atual.getDir(), valor)); // insere a direita
        return atual;
    }
    
    public void inserir(T valor) {
        raiz = inserirRec(raiz, valor); // inicia recursividade
    }

    private boolean removerRec(NoArv<T> atual, T valor) {
        if (atual == null){
            return false; // nao encontrou
        }
        else{
            if (atual.getValor().compareTo(valor) == 0){
                atual.setValor(null);
                return true; // removeu
            }
            else{ // continua a busca
                if (atual.getValor().compareTo(valor) > 0){
                    return removerRec(atual.getEsq(), valor); // busca a esquerda
                }
                else{
                    return removerRec(atual.getDir(), valor); // busca a direita
                }
            }
        }
    }
    
    public boolean remover(T valor) {
        return removerRec(raiz, valor); //inicia recursividade
    }
    
    private boolean buscarRec(NoArv<T> atual, T valor) {
        if (atual == null)
            return false; // nao encontrou
        else
            if (atual.getValor().compareTo(valor) == 0)
                return true; // encontrou
            else // continua a busca
                if (atual.getValor().compareTo(valor) > 0)
                    return buscarRec(atual.getEsq(), valor); // busca a esquerda
                else
                    return buscarRec(atual.getDir(), valor); // busca a direita
    }
    
    public boolean buscar(T valor) {
        return buscarRec(raiz, valor); // inicia recursividade
    }
    
    private void imprimirEmOrdemRec(NoArv<T> atual) {
        if (atual != null) {
            imprimirEmOrdemRec(atual.getEsq()); // imprime lado esquerdo primeiro
            System.out.print(atual.getValor() + ", "); // imprime no atual
            imprimirEmOrdemRec(atual.getDir()); // imprime lado direito por ultimo
        }
    }
    
    public void imprimirEmOrdem() {
        System.out.print("Elementos em ordem: ");
        imprimirEmOrdemRec(raiz);
        System.out.println();
    }
    
}
