#include<iostream>
using namespace std;
int cnt = 1;
void printNumber(int n) {
    if(n <= 0)
        return;
    cout << cnt << endl;
    cnt++;
    printNumber(n-1);
}

int main() {
    int n;
    cout << "Enter the N : ";
    cin >> n;
    printNumber(n);
    return 0;
}