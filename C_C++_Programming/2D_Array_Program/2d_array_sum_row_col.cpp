// Write a program to calculate sum of row

#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

void sum_of_row_col(int arr1[r][c])
{
    int i, j;
    cout << "Enter the element:"
         << "\n";

    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cin >> arr1[i][j];
        }
    }

    // Displaying the array
    cout << "Displaying the 2d array are....\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t "
                 << arr1[i][j];
        }
        cout << "\n";
    }

    // Logic to calculate sum of row
    for (i = 0; i < r; i++)
    {
        int s1 = 0, s2 = 0;
        for (j = 0; j < c; j++)
        {
            s1 += arr1[i][j];
            s2 += arr1[j][i];
        }
        cout << "\n"
             << "Row = " << s1
             << "\n"
             << "Col = " << s2
             << "\n";
    }
}
int main()
{
    int arr1[r][c];
    sum_of_row_col(arr1);
    return 0;
}