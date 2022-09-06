#include <iostream>
#include <list>
#include <algorithm>
#include <set>
#include <bits/stdc++.h>
using namespace std;

//classe que representa cada monomio do polinomio
class Termo {

private:

    int grau;
    float multiplicador;

public:

    Termo(int p_grau, float p_multiplicador){
        grau = p_grau;
        multiplicador = p_multiplicador;
    }

    int get_grau(){
        return grau;
    }

    int get_multiplicador(){
        return multiplicador;
    }

    void atualiza_termo(float p_multiplicador){
        multiplicador += p_multiplicador;
    }

    void mostra_termo(){
        cout << multiplicador << "*x^" << grau << " + ";
    }

};

class Polinomio {

private:

    int grau_max;
    list <Termo> *monomios = new list <Termo>; 
    list <Termo>::iterator it;

public:

    //construtor
    Polinomio(int p_grau) {
        grau_max = p_grau;
    }

    //destrutor
    ~Polinomio(){
        delete monomios;
    }

    void add(int p_grau, float p_multiplicador){

        //verifica se o grau do monomio a ser adicionado e maior que o grau max do poliinomio
        if(p_grau > grau_max)
            cout << "ERRO! - o grau do monomio e maior que o grau maximo do polinomio" << endl;
        
        else{

            //verifica se o monomio já existe
            bool flag_existe = false;
            for(it = monomios->begin(); it != monomios->end(); it++){
                
                //caso o monomio exista, ele e somado ao termo existente
                if(p_grau == it->get_grau()){

                    it->atualiza_termo(p_multiplicador);
                    flag_existe = true;

                }
                    
            }
        
            //se nao existe adiciona
            if(!flag_existe){
                
                Termo temp(p_grau, p_multiplicador);
                monomios->push_front(temp);

            }
            
        }        
        
    }

    void mostra(){

        cout << "P(x) = ";

        //loop que faz as chamadas do metodo que exibe cada monomio
        for(it = monomios->begin(); it != monomios->end(); it++){
            it->mostra_termo();
        }
        
        cout << "\b\b" << " " << endl;// apaga sinal '+' extra

    }

    float caucula(float x){

        float res = 0;

        //percorre a lista de monomios calculando cada termo com base no valor de x e somando tudo para chegar a resposta final
        for(it = monomios->begin(); it != monomios->end(); it++){
            res += pow(x, it->get_grau())*it->get_multiplicador();
        }

        return res;

    }
};

int main(void) {

    int p_grau;
    
    cout << "Digite o grau max do polinomio: " << endl;
    cin >> p_grau;

    Polinomio P(p_grau);
    int op = 0;

    //loop que apresenta as acoes possiveis 
    while(op != 4){
    
        //impressao do menu
        cout << "Digite a operacao desejada: " << endl;
        cout << "1 - Adicionar Monomio" << endl;
        cout << "2 - Mostrar Polinomio" << endl;
        cout << "3 - Calcular" << endl;
        cout << "4 - Sair" << endl;
        cin >> op;

        switch (op) {

        case 1:

            int grau_monomio;
            float multiplicador_monomio;

            cout << "Digite o grau do novo monomio: " << endl;
            cin >> grau_monomio;
            cout << "Digite o fator que multiplica o novo monomio: " << endl;
            cin >> multiplicador_monomio;

            P.add(grau_monomio, multiplicador_monomio);

            break;

        case 2:
            
            P.mostra();

            break;
        
        case 3:
        
            float x;
            cout << "Digite o valor da variável X:" << endl;
            cin >> x;
            cout << "P(" << x << ") = " << P.caucula(x) << endl;

            break;
        
        case 4:

            cout << "Ate a proxima = )" << endl;
            break;

        default:
            cout << "ERRO! - operacao invalida" << endl;
        }
    }
    
    return 0; // sucesso
}
