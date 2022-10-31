#include "complex.h"
#include <iostream>
#include <cmath>

using namespace std;

complex::complex(double real, double img) {
    this->real = real;
    this->img = img;
}

void complex::print() const {
    cout << "(" << real << ")" << "+" << "(" << img << ")" << "*i" << endl; 
}


complex complex::operator+(const complex &outro) const {
    return complex(real + outro.real, img + outro.img);
}

void complex::operator+=(const complex &outro) {
    real += outro.real;
    img += outro.img;
}

complex complex::operator-(const complex &outro) const {
    return complex(real - outro.real, img - outro.img);
}

void complex::operator-=(const complex &outro) {
    real -= outro.real;
    img -= outro.img;
}

complex complex::operator*(const complex &outro) const {
    return complex(real*outro.real - img*outro.img, real*outro.img + img*outro.real);
}

void complex::operator*=(const complex &outro) {
    double real_aux = real;
    double img_aux = img;
    real = real_aux*outro.real - img_aux*outro.img;
    img = real_aux*outro.img + img_aux*outro.real;
}

complex complex::operator/(const complex &outro) const {
    double denom = pow(outro.real, 2) + pow(outro.img, 2);
    return complex((real*outro.real + img*outro.img)/denom, 
    (img*outro.real - real*outro.img)/denom);
}

void complex::operator/=(const complex &outro) {
    double real_aux = real;
    double img_aux = img;
    double denom = pow(outro.real, 2) + pow(outro.img, 2);
    
    real = (real_aux*outro.real + img_aux*outro.img)/denom;
    img = (img_aux*outro.real - real_aux*outro.img)/denom;
}


double complex::operator%(const complex &number) {
    return sqrt(pow(real, 2) + pow(img, 2));
}