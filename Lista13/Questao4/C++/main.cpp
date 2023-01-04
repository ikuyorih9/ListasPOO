/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/main.cc to edit this template
 */

/* 
 * File:   main.cpp
 * Author: Daniel
 *
 * Created on 3 de janeiro de 2023, 19:24
 */

#include <cstdlib>
#include <iostream>
#include <random>
#include <list>
#include <vector>
#include <deque>
#include <chrono>
#include <cmath>

using namespace std;
using namespace std::chrono;

/*
 * 
 */
int main(int argc, char** argv) {
    
    cout << "Ex4 - C++\n";

    uniform_real_distribution<double> unif(0,1);
    default_random_engine re;
    
    long tempo_fim_list;
    long tempo_fim_deque;
    const int expoente = 6;
    
    vector<double> array;
    list<double> list;
    deque<double> deque;
    
    auto tempo_ini_array = high_resolution_clock::now();
    for(int i=0;i<pow(10,expoente);i++){
        array.push_back(unif(re));
    }
    for(int i=0;i<pow(10,expoente);i++){
        cout << array[i] << '\n';
    }
    for(int i=0;i<array.size()/2;i++){
        array.at(i);
    }
    array.clear();
    auto tempo_fim_array = high_resolution_clock::now();
    auto duration_array = duration_cast<milliseconds>(tempo_fim_array - tempo_ini_array);
    
    
    auto tempo_ini_l = high_resolution_clock::now();
    for(int i=0;i<pow(10,expoente);i++){
        list.push_back(unif(re));
    }
    auto l_front = list.begin();
    for(int i=0;i<pow(10,expoente);i++){
        cout << *l_front << '\n';
        advance(l_front, 1);
    }
    l_front = list.begin();
    for(int i=0;i<list.size()/2;i++){
        *l_front;
        advance(l_front, 1);
    }
    list.clear();
    auto tempo_fim_l = high_resolution_clock::now();
    auto duration_l = duration_cast<milliseconds>(tempo_fim_l - tempo_ini_l);
    
    
    auto tempo_ini_d = high_resolution_clock::now();
    for(int i=0;i<pow(10,expoente);i++){
        deque.push_back(unif(re));
    }
    for(int i=0;i<pow(10,expoente);i++){
        cout << deque.at(i) << '\n';
    }
    for(int i=0;i<list.size()/2;i++){
        deque.at(i);
    }
    deque.clear();
    auto tempo_fim_d = high_resolution_clock::now();
    auto duration_d = duration_cast<milliseconds>(tempo_fim_d - tempo_ini_d);
    
    
    cout << "Tempo array:" << duration_array.count() << '\n';
    cout << "Tempo list:" << duration_l.count() << '\n';
    cout << "Tempo deque:" << duration_d.count();

    return 0;
}

