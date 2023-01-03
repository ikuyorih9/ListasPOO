#ifndef PAR_H
#define PAR_H

template <class T>

class Par {
    
    private:

        //atributos - duas variáveis do tipo T
        T num1, num2;
 
    public:
    
        //contrutor - recebe por parâmetro dois valores do tipo T
        Par (T _num1, T _num2){
        
            num1 = _num1;
            num2 = _num2;
    
        }
        
        //métodos get
        //retorna o maior dentre os dois atributos
        T getMax (){

            if(num1 > num2)
                return num1;

            return num2;
        }  

        //retorna o menor dentre os dois atributos
        T getMin (){

            if(num1 < num2)
                return num1;

            return num2;
        }  
        
        //retorna a soma dos dois atributos
        T getSum (){

            return num1 + num2;
        }  
        
        //retorna o primeiro atributo
        T getFirst(){
            return num1;
        }
        
        //retorna o segundo atributo
        T getSecond(){
            return num2;
        }

};

#endif /* PAR_H */

