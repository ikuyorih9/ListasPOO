#ifndef PAR_H
#define PAR_H

template <class T>

class Par {
    
    private:
 
        T num1, num2;
 
    public:
    
        Par (T _num1, T _num2){
        
            num1 = _num1;
            num2 = _num2;
    
        }
        
        T getMax (){

            if(num1 > num2)
                return num1;

            return num2;
        }  

        T getMin (){

            if(num1 < num2)
                return num1;

            return num2;
        }  

        T getSum (){

            return num1 + num2;
        }  
        
        T getFirst(){
            return num1;
        }
        
        T getSecond(){
            return num2;
        }

};

#endif /* PAR_H */

