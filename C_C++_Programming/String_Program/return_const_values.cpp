#include<iostream>
using namespace std;

int main()
{
    const char *fun();
    const char *p;

    p = fun();
    // *p = "Hello";
    cout << p;
    return 0;  
}

const char *fun()
{
    return "Rain";
} 