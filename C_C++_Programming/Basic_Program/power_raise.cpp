#include <iostream>
#include<cmath>
using namespace std;
int main()
{
    int b, p;
    int result = 1;

    cout << " enter base and power";
    cin >> b;
    cin >> p;
    for (int i = 1; i <= p ; i++)
    {

        result = result*b;
    }
    cout << result << endl;
    return 0;
}