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
public class NoArv <T extends Comparable> {
    private T valor;
    private NoArv<T> esq;
    private NoArv<T> dir;
    
    NoArv(T valor, NoArv<T> esq, NoArv<T> dir) {
        this.valor = valor;
        this.esq = esq;
        this.dir = dir;
    }
    
    public void setValor(T valor) {
        this.valor = valor;
    }
    
    public T getValor() {
        return valor;
    }
    
    public void setEsq(NoArv<T> esq) {
        this.esq = esq;
    }
    
    public NoArv<T> getEsq() {
        return esq;
    }
    
    public void setDir(NoArv<T> dir) {
        this.dir = dir;
    }
    
    public NoArv<T> getDir() {
        return dir;
    }
}
