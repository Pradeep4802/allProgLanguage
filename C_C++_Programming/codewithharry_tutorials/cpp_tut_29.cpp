#include <iostream>
using namespace std;

class complex
{
    int a, b;

public:
    // Creating a constructor
    // Constructor is a special memeber function with same name as of the class. It is automatically invoked Whenever objects is created
    // It is used to initialize the objects of its class

    complex(void); // constructor declaration
    void printNumber()
    {
        cout << "Your number is " << a << " + " << b << "i" << endl;
    }
};

complex ::complex(void) // ----> This is a default constructor as it takes no parmeters
{
    a = 0;
    b = 0;
    // cout << "Hello World" << endl;
}
int main()
{
    complex c1, c2, c3;
    c1.printNumber();
    c2.printNumber();
    c3.printNumber();

    return 0;
}

// Properties of Constructor

// A constructor should be declared in the public section of the class
// They are automatically invoked whenever the object is created
// They cannot return values and do not have return types
// It can have default arguments
// We cannot refer to their address