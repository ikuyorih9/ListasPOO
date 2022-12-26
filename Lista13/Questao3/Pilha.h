/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Pilha.h
 * Author: ACER
 *
 * Created on 26 de Dezembro de 2022, 08:50
 */

#ifndef PILHA_H
#define PILHA_H
#include <deque>


using namespace std;

template <typename T>
class Pilha{
    private:
        deque<T> *container;
    public:
            Pilha(){
                container = new deque<T>();
            }
            ~Pilha(){
                delete container;
            }
            void push(const T &elem);
            T pop();
            T topo();
            int tamanho() const;
};

template <typename T>
void Pilha<T>::push(const T &elem){
    container->push_back(elem);
}

template <typename T>
T Pilha<T>::pop(){
    T elem = container->back();
    container->pop_back();
    return elem;
}

template <typename T>
T Pilha<T>::topo(){
    return container->back();
}

template <typename T>
int Pilha<T>::tamanho() const{
    return container->size();
}

#endif /* PILHA_H */

