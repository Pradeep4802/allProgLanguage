#include <iostream>
using namespace std;

// Base Class


class Employee
{
    int id;

public:
    float salary;
    Employee(int inpID)
    {
        id = inpID;
        salary = 34.0;
    }
};

// Derived Class syntax
// class derived-class-name: visibility-mode {base-class-name}
// {
// class members/methods/etc
// }

// Creating a Programmer class derived from Employee Base Class

int main()
{
    Employee harry(1), rohan(2);
    cout << harry.salary;
    cout << rohan.salary;
    return 0;
}