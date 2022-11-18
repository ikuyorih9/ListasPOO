/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: ACER
 *
 * Created on 30 de Outubro de 2022, 22:26
 */

#include "complex.h"
#include <iostream>
#include <vector>
#include <cstdlib>
#include <ctime>
#include <cmath>

using namespace std;

int main(int argc, char** argv) {

  // Alocação de variáveis
  double real = 0, img = 0;
  complex num(0,0);

  // Input do n
  int n;
  cout<<"Insira um valor positivo n:\n";
  cin>>n;

  // Cria o vetor
  vector<complex> vetor;
  // Reseta o gerador de números aleatórios
  srand(time(0));

  // Cria os números complexos
  for(int i=0;i<n;i++){
    real=rand()%100;
    img=rand()%100;
    complex x(real, img);
    vetor.push_back(x);
  }

  // Exibe os números criados
  cout<<"Números complexos criados:\n";
  for(int i=0;i<vetor.size();i++){
    vetor.at(i).print();
  }

  // Faz a soma
  for(int i=0;i<vetor.size();i++){
    num+=vetor.at(i);
  }

  // Printa na tela
  cout<<"Soma desses números complexos:\n";
  num.print();

  // Não houve alocação dinâmica usando new então não será necessário deletar os objetos

  return 0;
}

