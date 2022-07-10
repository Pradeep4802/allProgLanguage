#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

void multiply(int arr1[r][c], int arr2[r][c])
{
    int i, j;
    int temp = 0;

    // Taking input from user for 1st array
    cout << "Enter the first array element: \n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cin >> arr1[i][j];
        }
    }

    // Taking input from user for 2nd array
    cout << "Enter the second element: \n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cin >> arr2[i][j];
        }
    }

    // Displaying the read of first array element
    cout << "\n Displaying the read input for 1st array:..\n\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t "
                 << arr1[i][j];
        }
        cout << "\n";
    }

    // Displaying the read of second array element
    cout << "\n Displaying the read input 2nd array:..\n\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t "
                 << arr2[i][j];
        }
        cout << "\n";
    }

    // logic to swap the 2 array
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            temp = arr1[i][j];
            arr1[i][j] = arr2[i][j];
            arr2[i][j] = temp;
        }
    }

    // Display the output of the two swap array
    cout << "Display the swap matrix between two array are...\n\n";
    cout << "First swap array are.....\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t "
                 << arr1[i][j];
        }
        cout << "\n";
    }

    cout << "Second swap array are.....\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t "
                 << arr2[i][j];
        }
        cout << "\n";
    }
}

int main()
{
    int arr1[r][c], arr2[r][c];
    multiply(arr1, arr2);
    return 0;
}