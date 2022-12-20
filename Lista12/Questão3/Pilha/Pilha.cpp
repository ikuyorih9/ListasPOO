/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Pilha.cpp
 * Author: ACER
 * 
 * Created on 20 de Dezembro de 2022, 15:45
 */

#include "Pilha.h"
#include "PilhaVazia.h"
#include "PilhaCheia.h"

Pilha::Pilha(int Tam) {
    this->Tam = Tam;
    TopoPilha = -1;
    Elem = new int[Tam];
}

Pilha::~Pilha() {
    delete Elem;
}

void Pilha::push(int elem) {
    if (TopoPilha + 1 == Tam)
        //exception
        throw PilhaCheia();
    Elem[++TopoPilha] = elem;
}

int Pilha::pop() {
    if (TopoPilha == -1)
        //exception
        throw PilhaVazia();
    return Elem[TopoPilha--];
}

