/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   radio.cpp
 * Author: ACER
 * 
 * Created on 26 de Outubro de 2022, 23:51
 */

#include "radio.h"
#include <iostream>
#include <string>

using namespace std;

radio::radio() {
    cout << "Executou o construtor do radio" << endl;
    ligado = false;
}

void radio::liga() {
    cout << "Radio ligado" << endl;
    ligado = true;
}

void radio::desliga() {
    cout << "Radio desligado" << endl;
    cout << "..." << endl;
    ligado = false;
}

void radio::setEstacao(){
    cout << "Escolha a estação: " << endl;
    cout << "Opcao 1. AM: " << endl;
    cout << "Opcao 2. FM: " << endl;
    int opcao;
    cin >> opcao;
    if(opcao == 1){
        estacao = "AM";
        cout << "Radio AM escolhida" << endl;
    }
    else{
        estacao = "FM";
        cout << "Radio clube FM escolhida" << endl;
    }
    
}

radio::~radio() {
}

