#include "ContaCorrente.h"
#include "depositoInvalido.h"

using namespace std;

int main(int argc, char** argv) {
    
    //ponteiro para a conta
    conta *contaCorrente; 
    
    //cria uma conta
    contaCorrente = new conta();

    //tentativa de depositar um valor negativo que ocasiona a exceção de despósito inválido
    contaCorrente->depositar(-100); 

    //tentativa de sacar um valor maior que o saldo que ocasiona a exceção de saldo insuficiente
    contaCorrente->sacar(100);

    //libera memória
    delete contaCorrente;

    return 0;
}

