#ifndef SALDOINSUFICIENTE_H
#define SALDOINSUFICIENTE_H

#include <exception>

using namespace std;

class saldoInsuficiente: public runtime_error{
public:
    saldoInsuficiente(): runtime_error("Voce nao possui saldo suficiente para realizar a operacao!"){}
};


#endif /* SALDOINSUFICIENTE_H */