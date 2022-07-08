#include <iostream>
using namespace std;

const int r = 2;
const int c = 2;
int main()
{
    int arr[r][c];
    int *p;
    p = arr[0];
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            cin >> arr[i][j];
        }
    }

    cout << "Printing the element of two dimensional array.\n";
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            cout << arr[i][j] << "\n";
            cout << *(*(arr + i) + j) << "\n";
        }
    }
    return 0;
}