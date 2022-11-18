/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   complex.h
 * Author: ACER
 *
 * Created on 30 de Outubro de 2022, 22:26
 */

#ifndef COMPLEX_H
#define COMPLEX_H

class complex {

    public:

        complex(double, double);

        void print() const;
        complex operator+(const complex &) const;
        void operator+=(const complex &);
        complex operator-(const complex &) const;
        void operator-=(const complex &);
        complex operator*(const complex &) const;
        void operator*=(const complex &);
        complex operator/(const complex &) const;
        void operator/=(const complex &);


        /*  
            OBS: a sobrecarga do operador % está sendo realizada 
                para o cálculo do módulo não do resto da divisão
        */
        double operator%(const complex &);

    private:

        double real;
        double img;

    };

#endif /* COMPLEXO_H */

