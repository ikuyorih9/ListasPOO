#include <cstdlib>
#include "Par.h"
#include <ctime>
#include <iostream>

using namespace std;

int main(int argc, char** argv) {
    
    srand(time(0));
    
    //demomstração do funcionamento com inteiros
    Par<int> p1(rand()%100, rand()%100);
    cout << "Par: (" << p1.getFirst() << "," << p1.getSecond() << ")" << endl;
    cout << "Max: " << p1.getMax() << endl;
    cout << "Min: " << p1.getMin() << endl;
    cout << "Sum: " << p1.getSum() << endl;
    
    //demomstração do funcionamento com decimais
    Par<double> p2((double)(rand()%10000)/100, (double)(rand()%10000)/100);
    cout << "Par: (" << p2.getFirst() << "," << p2.getSecond() << ")" << endl;
    cout << "Max: " << p2.getMax() << endl;
    cout << "Min: " << p2.getMin() << endl;
    cout << "Sum: " << p2.getSum() << endl;
    
    return 0;
}

