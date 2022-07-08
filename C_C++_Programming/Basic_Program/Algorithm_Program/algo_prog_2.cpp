// 2. Write a C++ program to get the absolute difference between n and 51. If n is greater than 51 return triple the absolute difference.

#include<iostream>
using namespace std;

int difference(int a)
{
    const int x = 51;
    // if (a > x)
    // {
    //     return (a - x)*3;
    // }
    // return x - a;

    return a > x ? (a - x)*3 : x-a;
}

int main()
{
    int val;

    cout <<"Enter trhe value: ";
    cin >> val;

    int diff = difference(val);

    cout << endl << "The absolute difference are : " << diff;
    return 0; 
}