// 1. Write a C++ program to compute the sum of the two given integer values. If the two values are the same, then return triple their sum

#include<iostream>
using namespace std;

int sum_of_int(int a, int b)
{
    return a == b ? (a+b)*3 : (a+b);
}

int main()
{
    int val1, val2;
    cout << "Enter the value : ";
    cin >> val1 >> val2;

    int fin = sum_of_int(val1, val2);
    cout << endl << "The sum opf two integer are : " << fin ;
    return 0;
}