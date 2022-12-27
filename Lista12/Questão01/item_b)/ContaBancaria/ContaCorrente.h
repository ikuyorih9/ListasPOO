#ifndef CONTACORRENTE_H
#define CONTACORRENTE_H

#include <mutex>

using namespace std;

class conta {
public:
    conta();
    virtual ~conta();
    void depositar(int);
    void sacar(int);   
    int getSaldo();
    void realizarMultiplosDepositos(int, int);
    void realizarMultiplosSaques(int, int);
private:
    int saldo;
    mutex token; // token de acesso ao atributo saldo
};

#endif /* CONTACORRENTE_H */

