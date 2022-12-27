#include "ContaCorrente.h"
#include <iostream>
conta::conta() {
    saldo = 0;
}

conta::~conta() {
}

/// @brief permite a consulta ao saldo da conta
/// @return saldo da conta
int conta::getSaldo(){
    return saldo;
}

/// @brief realiza o depósito de um valor, acrescendo o saldo do valor que foi depositado
/// @param valor 
void conta::depositar(int valor) {

    int novoSaldo = saldo + valor; //saldo recalculado e salvo em uma variável temporária
    saldo = novoSaldo; //atribuição do novo saldo calculado ao atributo "saldo"

}

/// @brief realiza o saque de um valor, decrementando o saldo do valor que foi sacado
/// @param valor valor a ser decrescido do saldo
void conta::sacar(int valor){
    
    int novoSaldo = saldo - valor; //saldo recalculado e salvo em uma variável temporária
    saldo = novoSaldo; //atribuição do novo saldo calculado ao atributo "saldo"

}

/// @brief realiza vários depósitos com o mesmo valor
/// @param valor valor a ser depositado
/// @param qtdDepositos quantidade de depóritos a serem realizados
void conta::realizarMultiplosDepositos(int valor, int qtdDepositos) {

    if (valor <= 0)
        cout << "Saldo inválido!";

    else{
        
        for (size_t i = 0; i < qtdDepositos; i++){

            token.lock(); // pega o token impedindo que outra thread acesse o saldo
            depositar(valor);
            token.unlock(); // libera o token permitindo que outra thread acesse o saldo
            
        }
        
    }

}

/// @brief realiza vários saques com o mesmo valor
/// @param valor valor a ser sacado
/// @param qtdSaques quantidade de saques a serem realizados
void conta::realizarMultiplosSaques(int valor, int qtdSaques) {

    if (valor > saldo)
        cout << "Saldo inválido!";

    else{
        
        for (size_t i = 0; i < qtdSaques; i++){

            token.lock(); // pega o token impedindo que outra thread acesse o saldo
            sacar(valor);
            token.unlock(); // libera o token permitindo que outra thread acesse o saldo
            
        }
        
    }

}
