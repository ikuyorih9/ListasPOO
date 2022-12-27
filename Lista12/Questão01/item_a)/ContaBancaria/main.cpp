#include <cstdlib>
#include <iostream>
#include <thread>
#include "ContaCorrente.h"

/*
        Este código não possui um controle sobre a concorrência das threads, assim, ao executar
    esta versão da conta bancária, após os múltiplos depósitos e saques, o saldo provavelmente 
    será diferente de zero na maioria dos casos, devido ao conflito durante a execução das threads 
    que causa erros no cálculo do saldo 
*/

using namespace std;

int main(int argc, char** argv) {
    
    //ponteiro para a conta
    conta *contaCorrente; 
    
    //cria uma conta
    contaCorrente = new conta();
    
    //ponteiros para as threads
    thread *t1;
    thread *t2;
    thread *t3;
    thread *t4;

    //inicializa as threads
    t1 = new thread(&conta::realizarMultiplosDepositos, contaCorrente, 1, 5000); // inicia a thread 1
    t2 = new thread(&conta::realizarMultiplosDepositos, contaCorrente, 1, 5000); // inicia a thread 2
    t3 = new thread(&conta::realizarMultiplosSaques, contaCorrente, 1, 5000); // inicia a thread 1
    t4 = new thread(&conta::realizarMultiplosSaques, contaCorrente, 1, 5000); // inicia a thread 2

    //espera que elas terminem
    t1->join();
    t2->join();    
    t3->join();
    t4->join(); 

    //imprime o saldo após os depositos, que deve ser 10000     
    cout << "Saldo: " << contaCorrente->getSaldo() << endl;

    //libera memória
    delete contaCorrente;
    delete t1;
    delete t2;
    delete t3;
    delete t4;
    
    return 0;
}

