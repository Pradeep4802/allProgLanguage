#include <iostream>
using namespace std;

class complex
{
    int a, b;   

public:
    complex(int, int); // Constructor declarartion
    void printNumber()
    {
        cout << "Your number is " << a << " + " << b << "i" << endl;
    }
};
complex ::complex(int x, int y) // ----> This is a parametrized constructor as it accepts it takes tw0 parameter
{
    a = x;
    b = y;
    // cout << "Hello world";
}
int main()
{
    // Implicit call
    complex a(4, 1);

    // Explicit call
    complex b = complex(1, 1); 

    a.printNumber();
    b.printNumber();
    return 0;
}