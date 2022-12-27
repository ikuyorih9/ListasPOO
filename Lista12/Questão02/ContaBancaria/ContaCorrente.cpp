#include "ContaCorrente.h"
#include <iostream>

conta::conta() {
    saldo = 0;
}

conta::~conta() {
}

/// @brief permite a consulta do saldo da conta
/// @return saldo da conta
int conta::getSaldo(){
    return saldo;
}

/// @brief adiciona ao saldo o valor depositado
/// @param valor a ser depositado
void conta::depositar(int valor) {

    try{

        //se o valor depositado é zero ou negativo, lança exceção de depósito inválido
        if (valor <= 0)
            throw depositoInvalido();

        //atualiza o saldo
        else
            saldo += valor;

    }
    catch(depositoInvalido e){

        //imprime a mensagem do método "what()"
        cout << e.what() << endl;

    }
    

    

}

/// @brief decresce o saldo da conta do valor a ser sacado
/// @param valor valor a ser sacado
void conta::sacar(int valor){

    try{

        //se o valor a ser sacado é maior que o saldo, lança a exceção de saldo insuficiente
        if(valor > saldo)
            throw saldoInsuficiente();

        //atualiza o saldo
        else
            saldo -= valor;

    }
    catch(saldoInsuficiente e){

        //imprime a mensagem do método "what()"
        cout << e.what() << endl;

    }
   
}

