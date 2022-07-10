#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

void max_smax(int arr1[r][c])
{
    int i, j;
    int max = -32767, s_max = -32768;

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
            if (arr1[i][j] > max)
            {
                s_max = max;
                max = arr1[i][j];
            }
            else if (arr1[i][j] > s_max && arr1[i][j] != max)
            {
                s_max = arr1[i][j];
            }
        }
    }

    // Display the maximum and second maximum number from 2d array
    cout << "\n"
         << "Maximum = " << max
         << "\n"
         << "Second Maximum = " << s_max;
}

int main()
{
    int arr1[r][c];
    max_smax(arr1);
    return 0;
}