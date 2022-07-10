#include<iostream>
using namespace std;

void printName(string str, int length, int n) {
    if (n < 1)
    {
        return;
    }
    cout << str << endl;
    printName(str,length,n-1);
}

int main() {
    string str;
    int n;
    cout << "Enter the name: ";
    cin >> str;
    cout << "Enter How many times the name are printed: ";
    cin >> n;
    int length = str.length();
    printName(str, length, n);
    return 0;
}