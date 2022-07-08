// Write a c++ program to count how many element are positive and negative in a 2d array

#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

void count(int arr1[r][c])
{
    int i, j;
    int pos = 0;
    int neg = 0;
    int zero = 0;

    cout << "Enter the element: ";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cin >> arr1[i][j];
        }
    }

    // Displaying the 2d array are as follow....
    cout << "\n Displaying an array are....\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t "
                 << arr1[i][j];
        }
        cout << "\n";
    }

    // Logic to count how many element are positive and negative
    cout << "\n"
         << "Counting in progress...";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            if (arr1[i][j] > 0)
            {
                pos++;
            }
            else if (arr1[i][j] < 0)
            {
                neg++;
            }
            else
            {
                zero++;
            }
        }
    }

    // Total count of the element are..
    cout << "Total count are done the number are....\n";
    cout << "Positive = " << pos
         << "\n"
         << "Negative = " << neg
         << "\n"
         << "Zero's = " << zero
         << "\n";
}
int main()
{
    int arr1[r][c];
    count(arr1);
    return 0;
}