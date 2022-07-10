#include <iostream>
#include <stdio.h>
#include <cstdlib>
using namespace std;

void PrintHelloWorld()
{
    cout << "Hello World\n";
}
int *add(int *a, int *b)
{
    // cout << "\nAddress of a in add = \n"
    //      << &a;
    // cout << "\nValue in a of add (Address of a of main)= \n"
    //      << a;
    // cout << "\nValue at address stored in a of add  = \n"
    //      << *a;
    // cout << "\nValue at address stored in b of add  = \n"
    //      << *b;
    // int *c = (int*)malloc(sizeof(int));
    static int c = *a + *b;
    return &c;
}

int main()
{
    int a = 2, b = 4;
    // cout << "Address of a in main = \n"
    //      << &a;
    int *ptr = add(&a, &b); // a and b are integer local to main
    // PrintHelloWorld();
    cout << "\n Sum = "
         << *ptr;
    // return 0;
}