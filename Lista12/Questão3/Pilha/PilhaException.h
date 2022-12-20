/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   PilhaException.h
 * Author: ACER
 *
 * Created on 20 de Dezembro de 2022, 15:46
 */

#ifndef PILHAEXCEPTION_H
#define PILHAEXCEPTION_H
#include <string>

using namespace std;

class PilhaException {
public:
    PilhaException(string);
    virtual ~PilhaException();
    string mensagemException();
private:
    string mensagem;
};

#endif /* PILHAEXCEPTION_H */

