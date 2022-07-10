#include <iostream>
using namespace std;

int main()
{
    int *p;
    int a = 5;
    float b = 2.5;

    // p = &a;
    // cout << *((int *)p)
    //      << "\n";
    // p = &b;
    // cout << *((float *)p);
    // return 0;

    p = &a;
    a = a + *p;
    cout <<"\n Value of a = "<<a;
    cout <<" \n Value of a p = " <<*p;
    *p = *p + a;
    cout << "\n Value of a through p = " << *p;
    return 0;
}