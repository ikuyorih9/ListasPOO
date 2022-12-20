/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Pilha.h
 * Author: ACER
 *
 * Created on 20 de Dezembro de 2022, 15:45
 */

#ifndef PILHA_H
#define PILHA_H

class Pilha {
public:
    Pilha(int);
    virtual ~Pilha();
    int pop();
    void push(int);
private:
    int Tam;
    int TopoPilha;
    int *Elem;
};

#endif /* PILHA_H */

