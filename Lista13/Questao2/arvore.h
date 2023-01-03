#ifndef ARVORE_H
#define ARVORE_H

#include <iostream>
#include <vector>
#include <deque>

using namespace std;

template <class T>
class Arvore{
    public:
        Arvore(){};
        Arvore(const T&valor){
            this->valor = valor;
        }
        virtual ~Arvore(){}
        
        //Adiciona um novo nó na árvore.
        void adicionarNo(const T& valor){
            this->filhos.push_back(Arvore(valor));
        }
        
        //imprimir a árvore.
        void imprimirArvore(const int altura = 0) const{
            for(int i = 0; i < altura; ++i){
                if (i != altura - 1)
                    cout << " ";
                else
                    cout << "|--";
            }
            cout << this->valor << endl;
            
            for(int i = 0; i < this->filhos.size(); ++i){
                this->filhos.at(i).imprimirArvore(altura+1);
            }
        }
        
        void imprimir (){
            
        }
        
    private:
        T valor;
        vector <Arvore> filhos;

};

#endif /* ARVORE_H */

