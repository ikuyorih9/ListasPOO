#include "complex.h"
#include <iostream>

using namespace std;

int main(int argc, char** argv) {
    
    int op = 0;
    double real = 0; 
    double img = 0;
    //complex num(0,0);

    cout << "Digite o primeiro numero: " << endl;
    cout << "Parte real: ";
    cin >> real;
    cout << "Parte imaginaria: ";
    cin >> img;
    cout << endl;
    
    complex a(real, img);

    cout << "Digite o segundo numero: " << endl;
    cout << "Parte real: ";
    cin >> real;
    cout << "Parte imaginaria: ";
    cin >> img;
    cout << endl;

    complex b(real, img);

    cout << "Escolha uma operacao:" << endl;
    cout << "1 - Adicao" << endl;
    cout << "2 - Subtracao" << endl;
    cout << "3 - Multiplicacao" << endl;
    cout << "4 - Divisao" << endl;
    cin >> op;

    switch (op) {

        case 1:
            a.add(b);
            /*
            ou ainda:
            num = a.add(b);
            */
            break;

        case 2:
            a.sub(b);
            /*
            ou ainda:
            num = a.sub(b);
            */
            break;

        case 3:
            a.mul(b);
            /*
            ou ainda:
            num = a.mul(b);
            */
            break;

        case 4:
            a.div(b);
            /*
            ou ainda:
            num = a.div(b);
            */
            break;

        default:
            cout << "Opcao invalida!" << endl;
            break;
    }

    cout << "Resultado da operacao: ";
    a.print();
    cout << "Modulo: ";
    cout << a.mod() << endl;
    /*
    ou
    cout << "Resultado da operacao: ";
    num.print();
    cout << "Modulo: ";
    cout << num.mod() << endl;
    */
    
    return 0;
}

