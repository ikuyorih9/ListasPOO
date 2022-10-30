#ifndef COMPLEX_H
#define COMPLEX_H

class complex {

    public:

        complex(double, double);

        void print() const;
        complex operator+(const complex &) const;
        void operator+=(const complex &);
        complex operator-(const complex &) const;
        void operator-=(const complex &);
        complex operator*(const complex &) const;
        void operator*=(const complex &);
        complex operator/(const complex &) const;
        void operator/=(const complex &);


        /*  
            OBS: a sobrecarga do operador % está sendo realizada 
                para o cálculo do módulo não do resto da divisão
        */
        double operator%(const complex &);

    private:

        double real;
        double img;

    };

#endif /* COMPLEXO_H */

