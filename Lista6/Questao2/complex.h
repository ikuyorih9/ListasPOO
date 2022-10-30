#ifndef COMPLEX_H
#define COMPLEX_H

class complex {

    public:

        complex(double, double);

        void print() const;
        
        
        void add(const complex &);
        void sub(const complex &);
        void mul(const complex &);
        void div(const complex &);
        
/*
        complex add(const complex &);
        complex sub(const complex &);
        complex mul(const complex &);
        complex div(const complex &);
*/
        double mod();
    
    private:

        double real;
        double img;

    };

#endif /* COMPLEXO_H */

