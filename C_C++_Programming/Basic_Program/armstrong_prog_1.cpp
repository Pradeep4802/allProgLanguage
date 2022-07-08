#include <iostream>
using namespace std;
int main()
{
    int a, b, arm = 0;
    cout << " enter the number to get armstrong number ";
    cin >> a >> b;
    int  i, t;
    for (i = a; i <= b; i++)
    {
        t = i;
        int rev = 0;
        while (t != 0)
        {
            rev = t % 10;
            arm = arm + (rev * rev * rev);
            t = t / 10;
        }
        if (arm == i)
        {
            cout << i ;
        }
    }
    cout << endl;
}