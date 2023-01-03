#include <cstdlib>
#include "Par.h"
#include <ctime>

using namespace std;

int main(int argc, char** argv) {
    
    srand(time(0));
    
    Par<int> p1(rand()%100, rand()%100);
    cout << "PAr: (" << p1.getFirst() "," << p1.getSecond() << ")" << endl;
    cout << "Max: " << p1.getMax() << endl;
    cout << "Min: " << p1.getMin() << endl;
    cout << "Sum: " << p1.getSum() << endl;
    
    //Par<float> p2;
    
    return 0;
}

