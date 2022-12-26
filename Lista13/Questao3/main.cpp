/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: ACER
 *
 * Created on 26 de Dezembro de 2022, 08:49
 */

#include "Pilha.h"
#include <iostream>

/*
 * 
 */
int main(int argc, char** argv) {
    Pilha<int> PilhaInt;
    Pilha<string> PilhaString;
    
    cout <<"Aplicação:" << endl;
    cout <<"Inserindo e removendo nome e número USP dos membros do grupo:\n" << endl;
    cout <<"Inserindo..." << endl;
    
    PilhaString.push("Daniel");
    PilhaInt.push(12547614);
    
    PilhaString.push("Gabriel");
    PilhaInt.push(12547764);
    
    PilhaString.push("Guilherme");
    PilhaInt.push(12745229);
    
    PilhaString.push("Hugo");
    PilhaInt.push(12732037);

    cout <<"Inserção feita com sucesso!\n" << endl;
    
    //cout << "Topo da pilha: " << PilhaInt.topo() << endl;
    
    cout <<"Removendo...\n" << endl;
    while(PilhaInt.tamanho()>0){
        cout << PilhaString.pop() << endl;
        cout << PilhaInt.pop() << endl;
        cout << "\n";
    }
    
    cout <<"Remoção feita com sucesso!" << endl;

    return 0;
}

