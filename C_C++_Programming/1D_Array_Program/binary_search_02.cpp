#include <iostream>
using namespace std;

int bin_search(int arr2[], int n, int x)
{
    int lb = 0;
    int m = lb + (n - lb) / 2;
    while (lb <= n)
    {
        if (arr2[m] == x)
        {
            return m;
        }
        else if (arr2[m] < x)
        {
            lb = m;
        }
        else if (arr2[m] > x)
        {
            n = m;
        }
    }
}
int main()
{
    int arr1[] = {11, 32, 56, 67, 52};
    int n = sizeof(arr1) / sizeof(int);
    int ser = 11;
    int res = bin_search(arr1, n-1, ser);
    (arr1[res] == ser) ? cout << endl
                              << "Element found at the index: " << res : cout << endl << "Elements was not found.";
    return 0;
}