#include <iostream>
using namespace std;
void swap(int &p1, int &p2)
{
    int temp = p1;
    p1 = p2;
    p2 = temp;
}

void swap(double &p1, double &p2)
{
    double temp = p1;
    p1 = p2;
    p2 = temp;
}
int main()
{
    int a, b;
    double a1, b1;
    cout << "Enter The Integer value : " << endl;
    cin >> a >> b;
    cout << endl;
    cout << "Enter The Float value : " << endl;
    cin >> a1 >> b1;
    cout << endl;
    cout << "Before Swap Integer Value: " << endl
         << a << " and " << b;
    swap(a, b);
    cout << endl
         << "After Swap Integer Value: " << endl
         << a << " and " << b;
    cout << endl
         << " Before Swap Float Value: " << endl
         << a1 << " and " << b1;
    swap(a1, b1);
    cout << endl
         << "After swap Float Value: " << endl
         << a1 << " and " << b1;
    return 0;
}