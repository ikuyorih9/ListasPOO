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


void complex::add(const complex &outro) {
    real += outro.real;
    img += outro.img;
}

void complex::sub(const complex &outro) {
    real -= outro.real;
    img -= outro.img;
}

void complex::mul(const complex &outro) {
    double real_aux = real;
    double img_aux = img;
    real = real_aux*outro.real - img_aux*outro.img;
    img = real_aux*outro.img + img_aux*outro.real;
}

void complex::div(const complex &outro) {
    double real_aux = real;
    double img_aux = img;
    double denom = pow(outro.real, 2) + pow(outro.img, 2);

    real = (real_aux*outro.real + img_aux*outro.img)/denom;
    img = (img_aux*outro.real - real_aux*outro.img)/denom;
}

/*
complex complex::add(const complex &outro){
    return complex(real + outro.real, img + outro.img);
}

complex complex::sub(const complex &outro){
    return complex(real - outro.real, img - outro.img);
}

complex complex::mul(const complex &outro){
    return complex(real*outro.real - img*outro.img, real*outro.img + img*outro.real);
}

complex complex::div(const complex &outro){
    double denom = pow(outro.real, 2) + pow(outro.img, 2);
    return complex((real*outro.real + img*outro.img)/denom, 
    (img*outro.real - real*outro.img)/denom);
}
*/

double complex::mod(){
    return sqrt(pow(real, 2) + pow(img, 2));
}
