#ifndef ARVORE_H
#define ARVORE_H

#include <iostream>
#include <deque>

template <class T>
class Arvore{
    public:
        Arvore(){
            
        }
        
        virtual ~Arvore(){};
        void criarArvore();
    private:
        NoArvore <T> raiz;
        
            
};
template <class T>
class NoArvore{
    private:
        T valor;
        NoArvore <T> * noEsquerdo;
        NoArvore <T> * noDireito;
};

#endif /* ARVORE_H */

