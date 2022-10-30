/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: ACER
 *
 * Created on 26 de Outubro de 2022, 23:51
 */



#include "radiorelogio.h"
#include <iostream>
#include <string>

using namespace std;

/*
 * 
 */
int main() {
    
    int opc;
    cout << "Escolha o que voce quer utilizar: " << endl;
    
    cout << "Opcao 1. Radio" << endl;
    cout << "Opcao 2. Relogio" << endl;
    cout << "Opcao 3. Radio relogio" << endl;
    
    cin >> opc;
    

    if(opc == 1){
        radio ra;
        ra.liga();
        ra.setEstacao();
        cout << "Quando for desligar aperte 1" << endl;
        int off;
        cin >> off;
        if (off == 1){
            ra.desliga();
        }
        cout << "\n"; 
    }

    if (opc == 2){
        relogio re;
        cout << "Defina as horas do relogio: " << endl;
        int horasR;
        cin >> horasR;
        cout << "Defina os minutos do relogio: " << endl;
        int minutosR;
        cin >> minutosR;
        re.setHora(horasR, minutosR);
        cout << "\n";

        re.exibeHora();
        cout << "\n";


        cout << "Defina as horas do alarme: " << endl;
        int horasA;
        cin >> horasA;
        cout << "Defina os minutos do alarme: " << endl;
        int minutosA;
        cin >> minutosA;
        re.setAlarme(horasA,minutosA);
        cout << "\n";
    }

     if(opc == 3){
        radiorelogio rr;
        rr.liga();
        
        cout << "Qual acao deseja fazer?" << endl;
        cout << "1.Definir horário" << endl;
        cout << "2.Definir alarme" << endl;
        cout << "3.Escolher estacao de radio" << endl;
        cout << "4.Escolher alarme para trocar estacao de radio" << endl;
        cout << "5.Desligar" << endl;
        
        int opcrr;
        cin >> opcrr;

        if(opcrr == 1){
            cout << "Defina as horas do radio relogio: " << endl;
            int horasRR;
            cin >> horasRR;

            cout << "Defina os minutos do radio relogio: " << endl;
            int minutosRR;
            cin >> minutosRR;

            rr.setHora(horasRR, minutosRR);

            rr.exibeHora();
        }
        
        if(opcrr == 2){
            cout << "Defina as horas do alarme: " << endl;
            int horasARR;
            cin >> horasARR;
            cout << "Defina os minutos do alarme: " << endl;
            int minutosARR;
            cin >> minutosARR;
            rr.setAlarme(horasARR,minutosARR);
            cout << "\n";
        }
        
        if (opcrr == 3){
            rr.setEstacao();
        }
        
        if(opcrr == 4){
            rr.setAlarmeEstacao();
        }
        
        if(opcrr == 5){
        rr.desliga();
        }
   }  
    return 0;
}

