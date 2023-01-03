#include <cstdlib>
#include <iostream>
#include "arvore.h"
#include "NoArvore.h"

using namespace std;

int main(int argc, char** argv) {
    NoArvore<int> * no = new NoArvore<int>(3);
    no->adicionar(new NoArvore<int>(2));
    no->adicionar(new NoArvore<int>(5));
    no->adicionar(new NoArvore<int>(10));
    no->adicionar(new NoArvore<int>(9));
    no->adicionar(new NoArvore<int>(11));
    no->adicionar(new NoArvore<int>(7));
    
    cout << "Imprimindo arvore: " << endl;
    cout << "   ";
    no->imprimir();
    cout << endl;
    
    cout << "Removendo o numero 9... " << endl;
    no->remover(9);
    
    cout << "Imprimindo arvore: " << endl;
    cout << "   ";
    no->imprimir();
    cout << endl;
    
    cout << "Removendo o numero 3 (raiz)... " << endl;
    no->remover(3);
    
    cout << "Imprimindo arvore: " << endl;
    cout << "   ";
    no->imprimir();
    cout << endl;
    
    cout << "Verificando se 7 esta na arvore..." << endl;
    if(no->estaNaArvore(7))
        cout << "\tSim!" << endl;
    else
        cout << "\tNao!" << endl;
    
    cout << "Liberando memoria..." << endl;
    no->liberar();
}

