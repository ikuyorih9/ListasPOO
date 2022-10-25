#include <iostream>

#include "poligono.h"
#include "quadrado.h"
#include "triangulo.h"

using namespace std;

int main(int argc, char** argv) {
    Quadrado *q = new Quadrado;
    q->ajustarAltura(10);
    q->ajustarBase(10);
    
    float area = q->retornaArea();
    cout << "A area do quadrado eh "<< area << endl;
    
    Triangulo * t = new Triangulo;
    t->ajustarAltura(2);
    t->ajustarBase(4);
    
    area = t->retornaArea();
    cout << "A area do triangulo eh " << area << endl;
    
    delete q;
    delete t;
    
    return 0;
}

