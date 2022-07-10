#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

void sum_positive_negative(int arr1[r][c])
{
    int i, j;
    int sum_pos = 0, sum_neg = 0;

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
    cout << "\n Displaying the read input:..";
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
            if (arr1[i][j] > 0)
            {
                sum_pos += arr1[i][j];
            }
            else
            {
                sum_neg += arr1[i][j];
            }
        }
    }

    // Display the sum of even and odd number
    cout << "\n"
         << "Sum of Positive number = " << sum_pos
         << "\n"
         << "Sum of Negative Number = " << sum_neg;
}

int main()
{
    int arr1[r][c];
    sum_positive_negative(arr1);
    return 0;
}