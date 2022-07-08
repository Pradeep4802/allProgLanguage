// Write a c++ program to do transpose of a matrix

#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

void transpose(int arr1[r][c])
{
    int i, j;

    cout << "Enter the element:\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cin >> arr1[i][j];
        }
    }

    // Displaying the 2d array
    cout << "\n"
         << "Displaying the 2d array format....\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t "
                 << arr1[i][j];
        }
        cout << "\n";
    }

    // Logic to do tanspose in a matrix
    // for (i = 0; i < r; i++)
    // {
    //     for (j = 0; j < c; j++)
    //     {
    //         arr1[i][j] = arr1[j][i];
    //     }
    // }

    cout << "\n"
         << "Transpose in a matrix are....\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t "
                 << arr1[j][i];
        }
        cout << "\n";
    }
}

int main()
{
    int arr1[r][c];
    transpose(arr1);
    return 0;
}