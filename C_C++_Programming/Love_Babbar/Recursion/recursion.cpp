#include<iostream>
using namespace std;

int printFact(int n) {
    if(n == 0) {
        return 1;
    }
    int fact = n * printFact(n-1);
    return fact;
}

int main() {
    int n = 13;
    cout << printFact(n);
    return 0;
}