// Program to compute absolute value
// Works for both int and float

#include <iostream> 
using namespace std;

int abs(int var)
{
    if (var < 0)
    {
        var = -var;
    }
    return var;
}

float abs(float var)
{
    if (var < 0.0)
    {
        var = -var;
    }
    return var;
}

int main()
{
    cout << "the absolute value are: " << abs(-56) << endl;
    cout << "The absolute value of 2nd function are: " << abs(88.78) << endl;
    return 0;
}