#include<iostream>
using namespace std;

int main()
{
    int a;
    int *p;
    a = 10;
    p=&a;  // &a = address of a 
    // cout<<"*p = "<<*p<<endl;
    // cout<<"&p = "<<&p<<endl;  // *p- value at address pointed by p
    // cout <<"&a = "<< &a << endl;
    *p = 12;
    cout << "p1 = " << p<<endl;
    cout << "p2 = " << p+1<<endl;
    return 0;  
}