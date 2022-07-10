// 4. Write a C++ program to check a given integer and return true if it is within 10 of 100 or 200.

#include <iostream>
#include <cmath>
using namespace std;

bool func2(int x1)
{

    if (abs(100 - x1) <= 10 || abs(200 - x1) <= 10)
        return true;
    return false;
}

int main()
{
    int x;
    cout << "Enter the value: ";
    cin >> x;
    cout << func2(x);
    return 0;
}