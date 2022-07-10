#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

void check_even_odd(int arr1[r][c])
{
    int i, j;
    int c1 = 0, c2 = 0;
    cout << "Enter the element:";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cin >> arr1[i][j];
        }
    }

    // Displaying the reading element
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t "
                 << arr1[i][j];
        }
        cout << "\n";
    }

    // logic to create to find a number is even or odd
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            if (arr1[i][j] % 2 == 0)
            {
                c1++;
            }
            else
            {
                c2++;
            }
        }
    }

    // print the total number of even and odd are present in the array 
    cout << "\n"
         << "Total Even = " << c1
         << "\n"
         << "Total Odd = " << c2;
}
int main()
{
    int arr1[r][c];
    check_even_odd(arr1);
    return 0;
}