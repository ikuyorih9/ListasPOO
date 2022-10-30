/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   relogio.cpp
 * Author: ACER
 * 
 * Created on 26 de Outubro de 2022, 23:52
 */

#include "relogio.h"
#include <iostream>

using namespace std;

relogio::relogio() {
    cout << "Executou o construtor do relogio" << endl;
    h = m = hA = mA = 0; // hora e minutos default
}

void relogio::setHora(int h, int m) {
    this->h = h;
    this->m = m;
    cout << "Hora redefinida" << endl;
}

void relogio::setAlarme(int hA, int mA) {
    this->hA = hA;
    this->mA = mA;
    cout << "Alarme definido para: " << hA << ":" << mA << endl;
}

void relogio::exibeHora(){
    cout << "Hora atual: " << h << ":" << m << endl;
}

relogio::~relogio() {
    
}

