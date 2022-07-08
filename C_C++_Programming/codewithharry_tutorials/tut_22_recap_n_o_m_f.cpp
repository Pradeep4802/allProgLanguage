// OOPS - Classes and objects

// C++ --> initially called --> C with classes by stroustrap
// class --> extrension of structure (in C)
// structures had Limitations
// --> members are public
// --> No methods
// classes = structures + more
// classes can have methods and properties
// classes --> can make few members as private & few as public
// structures in C++ are typedef
// You can declare objects along with class declaration
// class Employee{
//     class defintion
// }harry, rohan, lovish;
// harry.salary = 8 makes no sense if salary is private

// Nesting of member Function
#include <iostream>
#include <string>
using namespace std;
class binary
{
    string s;
    void chk_bin(void);

public:
    void read(void);
    void ones_complement(void);
    void display(void);
};

void binary ::read(void)
{
    cout << "Enter a binary number " << endl;
    cin >> s;
}

void binary ::chk_bin(void)
{
    for (int i = 0; i < s.length(); i++)
    {
        if (s.at(i) != '0' && s.at(i) != '1')
        {
            cout << "Incorrect binary format" << endl;
            exit(0);
        }
    }
}

void binary ::ones_complement(void)
{
    chk_bin();
    for (int i = 0; i < s.length(); i++)
    {
        if (s.at(i) == '0')
        {
            s.at(i) = '1';
        }
        else if (s.at(i) == '1')
        {
            s.at(i) = '0';
        }
    }
}
void binary ::display(void)
{
    cout << "Displaying your binary number" << endl;
    for (int i = 0; i < s.length(); i++)
    {
        cout << s.at(i);
    }
    cout << endl;
}
int main()
{

    binary b;
    b.read();
    // b.chk_bin();
    b.ones_complement();
    b.display();
    return 0;
}