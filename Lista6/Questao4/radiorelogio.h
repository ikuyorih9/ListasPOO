/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   radiorelogio.h
 * Author: ACER
 *
 * Created on 26 de Outubro de 2022, 23:54
 */

#ifndef RADIORELOGIO_H
#define RADIORELOGIO_H

#include <iostream>
#include "radio.h"
#include "relogio.h"

using namespace std;

class radiorelogio : public radio, public relogio {
public:
    radiorelogio();
    void liga();
    void desliga();
    void setAlarme(int, int);
    void setEstacao();
    void exibeHora();
    void setHora(int,int);
    void setAlarmeEstacao();
};

#endif /* RADIORELOGIO_H */

