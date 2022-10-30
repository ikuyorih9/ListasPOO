/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   relogio.h
 * Author: ACER
 *
 * Created on 26 de Outubro de 2022, 23:52
 */

#ifndef RELOGIO_H
#define RELOGIO_H

class relogio {
public:
    relogio();
    virtual void setHora(int, int);
    virtual void setAlarme(int, int);
    virtual void exibeHora();
    virtual ~relogio();
protected:
    int h;
    int m;
    int hA;
    int mA;
};

#endif /* RELOGIO_H */

