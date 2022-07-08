#include <iostream>
using namespace std;
int main()
{
    int amt;
    cout << "enter the amount";
    cin >> amt;
    int n500, n200, n100, n50, n20, n10, n5, n2, n1;
    n500 = n200 = n100 = n50 = n20 = n10 = n5 = n2 = n1 = 0;
    if (amt >= 500)
    {
        n500 = amt / 500;
        amt = amt - (n500 * 500);
    }
    if (amt >= 200)
    
    {
        n200 = amt / 200;
        amt = amt - (n200 * 200);
    }
    cout << "500 =" << n500 << "   200 = " << n200 << " amount " << amt;
    return 0;
}