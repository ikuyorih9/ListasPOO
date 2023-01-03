#ifndef NOARVORE_H
#define NOARVORE_H

#include <iostream>
#include <vector>

using namespace std;

template <class T>
class NoArvore{
    private:
        T valor;
        NoArvore<T> * pai;
        NoArvore <T> * filhoEsquerdo;
        NoArvore <T> * filhoDireito;
        
        NoArvore<T> * retornaMenorNo(){
            if(this == NULL)
                return NULL;
            if(this->filhoEsquerdo != NULL){
                return this->filhoEsquerdo->retornaMenorNo();
            }
            return this; 
        }
        
    public:
        NoArvore(T valor){
            this->pai = NULL;
            this->valor = valor;
            this->filhoEsquerdo = NULL;
            this->filhoDireito = NULL;
        }
        
        void adicionar(NoArvore * no);
        bool estaNaArvore(T valor);
        void imprimir();
        void liberar();
        void remover(T valor);
        T retornaValor(){
            return valor;
        }
};

template <class T>
void NoArvore<T>::adicionar(NoArvore* no){
    //Se o novo nó deve estar a esquerda.
    if(no->valor <= this->valor){
        if(this->filhoEsquerdo == NULL){
            this->filhoEsquerdo = no;
            this->filhoEsquerdo->pai = this;
        }
        else
            filhoEsquerdo->adicionar(no);
    }
    //Se o novo nó deve estar a direita.
    else{
        if(this->filhoDireito == NULL){
            this->filhoDireito = no;
            this->filhoDireito->pai = this;
        }
        else
            filhoDireito->adicionar(no);
    }
}

template <class T>
bool NoArvore<T>::estaNaArvore(T valor){
    if(this == NULL)
        return false;
    
    if(valor == this->valor){
        return true;
    }
    else if(valor < this->valor)
        return this->filhoEsquerdo->estaNaArvore(valor);
    else
        return this->filhoDireito->estaNaArvore(valor);
}

template <class T>
void NoArvore<T>::remover(T valor){
    if(this == NULL)
        return;
    if(valor == this->valor){
        if(this->filhoEsquerdo == NULL and this->filhoDireito == NULL){
            this->pai = NULL;
            delete(this);
            return;
        }
        else if(this->filhoEsquerdo != NULL and this->filhoDireito == NULL){
            if(this->valor < this->pai->valor){
                this->pai->filhoEsquerdo = this->filhoEsquerdo;
                this->filhoEsquerdo->pai = this->pai;
            }
            else{
               this->pai->filhoDireito = this->filhoEsquerdo;
               this->filhoEsquerdo->pai = this->pai; 
            }
            delete(this);
            return;
        }
        else if(this->filhoEsquerdo == NULL and this->filhoDireito != NULL){
            if(this->valor < this->pai->valor){
                this->pai->filhoEsquerdo = this->filhoDireito;
                this->filhoDireito->pai = this->pai;
            }
            else{
               this->pai->filhoDireito = this->filhoDireito;
               this->filhoDireito->pai = this->pai; 
            }
            delete(this);
            return;
        }
        
        NoArvore<T> * menor = this->filhoDireito->retornaMenorNo();
        if(menor != NULL){
            menor->filhoEsquerdo = this->filhoEsquerdo;
            if(menor->pai != this){
                menor->pai->filhoEsquerdo = menor->filhoDireito;
                menor->filhoDireito = this->filhoDireito;
            }
            menor->pai = this->pai;
        }

        //RAIZ.
        if(this->pai == NULL){
            this->valor = menor->valor;
            this->filhoEsquerdo = menor->filhoEsquerdo;
            this->filhoEsquerdo->pai = this;
            this->filhoDireito = menor->filhoDireito;
            this->filhoDireito->pai = this;
            delete(menor);
        }
        else{
            if(this->valor <= this->pai->valor)
                this->pai->filhoEsquerdo = menor;
            else
                this->pai->filhoDireito = menor;
            delete(this);
        }    
        
    }
    else if(valor < this->valor)
        this->filhoEsquerdo->remover(valor);
    else{
        this->filhoDireito->remover(valor);
    }
}

template <class T>
void NoArvore<T>::imprimir(){
    if(this == NULL){
        return;
    }
    
    this->filhoEsquerdo->imprimir();
    cout << valor << " ";
    this->filhoDireito->imprimir();
}

template <class T>
void NoArvore<T>::liberar(){
    if(this == NULL)
        return;
    this->filhoEsquerdo->liberar();
    this->filhoDireito->liberar();
    
    delete(this);
}

#endif /* NOARVORE_H */

