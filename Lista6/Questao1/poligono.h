#ifndef POLIGONO_H
#define POLIGONO_H

class Poligono{
protected:
    float altura;
    float base;
public:
    void ajustarBase(float base);
    void ajustarAltura(float altura);
    virtual float retornaArea() = 0;
    virtual ~Poligono();
};


#endif /* POLIGONO_H */

