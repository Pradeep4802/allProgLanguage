#include <iostream>
#include <string>
#include <algorithm>
#include <cmath>
using namespace std;

int main()
{
    double x;
    // double y;

    cout << "This program will round a number DOWN: " << endl;
    // cout << "This program will round a nmber UP: " << endl;
    // cout << "This program will round a number to the nearest whole integer: " << endl;
    // cout << "This program will return the absolute of a #: " << endl;
    // cout << "This program will return x ^ y: " << endl;
    // cout << "This program will enter the max of two numbers: " << endl;;
    // cout << "This program will enter the min of two numbers: " << endl;;
    cout << "Enter in the number:";
    cin >> x;
    // cout << "Enter in number 2:";
    // cin >> y;

    double z = floor(x);

    cout << z;
    cout << endl;
    return 0;
}