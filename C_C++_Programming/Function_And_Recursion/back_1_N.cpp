// WAP to print linearly from 1 to N(But my backtracking)

#include<iostream>
using namespace std;

void printNumber (int n ) {
    if(n <= 0)
        return;
    printNumber(n-1);
    cout << n << endl;
}

int main() {
    int n;
    cout << "Enter the N: ";
    cin >> n;
    printNumber(n);
    return 0;
}