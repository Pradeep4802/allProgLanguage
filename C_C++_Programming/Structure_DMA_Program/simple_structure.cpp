#include <iostream>
using namespace std;

struct distance
{
    int feet;
    float inch;
};

int main()
{
    struct distance d1, d2;

    d1.feet = 12;
    d1.inch = 2.6;

    cout << "\n Enter the feet and inch:>> ";
    cin >> d2.feet >> d2.inch;

    cout << "\n"
         << d1.feet << "\'-" << d1.inch << "\"";
    cout << "\n"
         << d2.feet << "\'-" << d2.inch << "\"";
    return 0;
}