#ifndef DEPOSITOINVALIDO_H
#define DEPOSITOINVALIDO_H

#include <exception>

using namespace std;

class depositoInvalido: public runtime_error{
public:
    depositoInvalido(): runtime_error("Deposito invalido!"){}
};

#endif /* DEPOSITOINVALIDO_H */