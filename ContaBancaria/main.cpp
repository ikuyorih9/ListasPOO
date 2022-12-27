#include <cstdlib>
#include <iostream>
#include <thread>
//#include <pthread.h>
#include "ContaCorrente.h"

using namespace std;

int main(int argc, char** argv) {
    
    //ponteiro para a conta
    conta *contaCorrente; 
    
    //cria uma conta
    contaCorrente = new conta();
    
    //ponteiros para as threads
    thread *t1;
    thread *t2;
    
    t1 = new thread(&contador::depositar, contaCorrente, 1); // inicia a thread 1
    t2 = new thread(&contador::depositar, contaCorrente, 1); // inicia a thread 2
    
    t1->join();
    t2->join();
    
    cout << "Saldo: " << contaCorrente->getSaldo();
    
    delete contaCorrente;
    delete t1;
    delete t2;

    return 0;
}

