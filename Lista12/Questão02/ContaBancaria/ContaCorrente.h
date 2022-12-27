#ifndef CONTACORRENTE_H
#define CONTACORRENTE_H

#include <mutex>
#include "saldoInsuficiente.h"
#include "depositoInvalido.h"

using namespace std;

class conta {
public:
    conta();
    virtual ~conta();
    void depositar(int);
    void sacar(int);   
    int getSaldo();
    void realizarMultiplosDepositos(int, int);
private:
    int saldo;
};

#endif /* CONTACORRENTE_H */

