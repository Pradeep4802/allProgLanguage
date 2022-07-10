#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

void sum_even_odd(int arr1[r][c])
{
    int i, j;
    int sum_even = 0, sum_odd = 0;

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
            if (arr1[i][j] % 2 == 0)
            {
                sum_even += arr1[i][j];
            }
            else
            {
                sum_odd += arr1[i][j];
            }
        }
    }

    // Display the sum of even and odd number
    cout << "\n"
         << "Sum of Even = " << sum_even
         << "\n"
         << "Sum of Odd = " << sum_odd;
}

int main()
{
    int arr1[r][c];
    sum_even_odd(arr1);
    return 0;
}