// 3. Write a C++ program to check two given integers, and return true if one of them is 30 or if their sum is 30.

#include <iostream>
using namespace std;

bool func1(int a, int b)
{

    return a == 30 || b == 30 || a + b == 30;
}

int main()
{
    int val1, val2;

    cout << "Enter the value 1 and 2: ";
    cin >> val1 >> val2;

    cout << func1(val1, val2);
    return 0;
}