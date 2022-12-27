#ifndef CONTACORRENTE_H
#define CONTACORRENTE_H

#include <mutex>
//#include <pthread.h>

using namespace std;

class conta {
public:
    conta();
    virtual ~conta();
    void depositar(int);
    void sacar(int);   
    int getSaldo();
private:
    int saldo;
};

#endif /* CONTACORRENTE_H */

