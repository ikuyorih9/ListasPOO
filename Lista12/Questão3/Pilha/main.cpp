/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: ACER
 *
 * Created on 20 de Dezembro de 2022, 15:42
 */

#include <cstdlib>
#include <iostream>
#include "Pilha.h"
#include "PilhaException.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    
    Pilha pilha(5); 
    
    try {
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        //erro
        //pilha.push(6);
        
        cout << pilha.pop() << endl;
        cout << pilha.pop() << endl;
        cout << pilha.pop() << endl;
        cout << pilha.pop() << endl;
        cout << pilha.pop() << endl;
        //pilha vazia
        //cout << pilha.pop() << endl;
        

    } catch(PilhaException e) {
        cout << "Erro: " << e.mensagemException() << endl;
    }
    
    return 0;
}

