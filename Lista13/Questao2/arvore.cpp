#include <iostream>
#include "arvore.h"

using namespace std;

template <class T>
Arvore * Arvore<T>::criarArvore(){
    Arvore * arvore = new Arvore();
    arvore.raiz = NULL;
    return arvore;
}