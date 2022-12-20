/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   PilhaException.cpp
 * Author: ACER
 * 
 * Created on 20 de Dezembro de 2022, 15:46
 */

#include "PilhaException.h"

PilhaException::PilhaException(string mensagem) {
    this->mensagem = mensagem;
}

string PilhaException::mensagemException(){
    return mensagem;
}

PilhaException::~PilhaException() {
}


