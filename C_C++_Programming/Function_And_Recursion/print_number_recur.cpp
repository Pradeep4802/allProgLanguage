#include<iostream>
using namespace std;
// int cnt = 1;
// void printNumber1(int n) {
//     if(n <= 0)
//         return;
//     cout << cnt << endl;
//     cnt++;
//     printNumber(n-1);
// }

void printNumber2(int n) {
    if(n <= 0)
        return;
    cout << n << endl;
    printNumber2(n-1);
}

int main() {
    int n;
    cout << "Enter the N : ";
    cin >> n;
    // printNumber1(n);
    printNumber2(n);
    return 0;
}