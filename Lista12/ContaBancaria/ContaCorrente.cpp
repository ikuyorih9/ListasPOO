#include "ContaCorrente.h"
#include <iostream>
conta::conta() {
    saldo = 0;
}

conta::~conta() {
}

int conta::getSaldo(){
    return saldo;
}

void conta::depositar(int valor) {

    if (valor <= 0)
        cout << "Saldo inválido!";

    else{
        
        int novoSaldo = saldo + valor;
        saldo = novoSaldo;
        
    }

}

void conta::sacar(int valor){
    
    if(valor > saldo)
        cout << "saldo insuficiente!";
    
    else{
        
        int novoSaldo = saldo - valor;
        saldo = novoSaldo;
        
    }
}