/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   radiorelogio.cpp
 * Author: ACER
 * 
 * Created on 26 de Outubro de 2022, 23:54
 */

#include "radiorelogio.h"

radiorelogio::radiorelogio() : radio(), relogio() {
     cout << "Executou o construtor do radiorelogio" << endl;
}

void radiorelogio::liga() {
    cout << "Radio relogio ligado" << endl;
    ligado = true;
}

void radiorelogio::desliga() {
    cout << "Radio relogio desligado" << endl;
    ligado = false;    
}
    
void radiorelogio::setAlarme(int hA, int mA) {
    relogio::setAlarme(hA, mA);
}

void radiorelogio::setEstacao(){
    radio::setEstacao();
}

void radiorelogio::setHora(int h, int m){
    relogio::setHora(h, m);
}

void radiorelogio::exibeHora(){
    
    relogio::exibeHora();
}

void radiorelogio::setAlarmeEstacao(){
    cout << "Escolha um alarme para trocar de estacao" << endl;
    cout << "Defina as horas do alarme: " << endl;
    int hARR;
    cin >> hARR;
    cout << "Defina os minutos do alarme: " << endl;
    int mARR;
    cin >> mARR;
    relogio::setAlarme(hARR,mARR);
    cout << "\n";
    radio::setEstacao();
    cout << "Estacao sera trocada no alarme das: " << hARR << ":" << mARR << endl;
}


