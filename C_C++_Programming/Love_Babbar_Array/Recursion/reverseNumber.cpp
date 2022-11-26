#include <iostream>
using namespace std;

void print(int n) {
    if(n == 0) {
        return;
    }
    cout << n << " ";
    print(n-1);
}

int main() {
    int n;
    cout << "Enter the value of n" << endl;
    cin >> n;

    cout << "Printing in Decreasing Order " << endl;

    //function call
    print(n);
    cout << endl;
    return 0;
}