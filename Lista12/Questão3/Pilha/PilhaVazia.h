/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   PilhaVazia.h
 * Author: ACER
 *
 * Created on 20 de Dezembro de 2022, 15:46
 */

#ifndef PILHAVAZIA_H
#define PILHAVAZIA_H
#include "PilhaException.h"

class PilhaVazia : public PilhaException{
public:
    PilhaVazia();
    virtual ~PilhaVazia();
};

#endif /* PILHAVAZIA_H */

