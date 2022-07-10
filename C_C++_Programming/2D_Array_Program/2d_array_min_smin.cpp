#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

void min_smin(int arr1[r][c])
{
    int i, j;
    int min = 32766, s_min = 32767;

    // Taking input from user
    cout << "Enter the element: ";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cin >> arr1[i][j];
        }
    }

    // Displaying the read of array
    cout << "\n Displaying the read input:..\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t "
                 << arr1[i][j];
        }
        cout << "\n";
    }

    // logic to do sum of even and odd
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            if (arr1[i][j] < min)
            {
                s_min = min;
                min = arr1[i][j];
            }
            else if (arr1[i][j] < s_min && arr1[i][j] != min)
            {
                s_min = arr1[i][j];
            }
        }
    }

    // Display the minimum and second minimum number from 2d array
    cout << "\n"
         << "Minimum = " << min
         << "\n"
         << "Second Minimum = " << s_min;
}

int main()
{
    int arr1[r][c];
    min_smin(arr1);
    return 0;
}