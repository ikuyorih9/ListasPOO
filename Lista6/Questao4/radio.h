/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   radio.h
 * Author: ACER
 *
 * Created on 26 de Outubro de 2022, 23:51
 */

#ifndef RADIO_H
#define RADIO_H

#include <iostream>

using namespace std;

class radio {
public:
    radio();
    virtual void liga();
    virtual void desliga();
    virtual void setEstacao();
    virtual ~radio();
protected:
    bool ligado;
    string estacao;
};

#endif /* RADIO_H */

