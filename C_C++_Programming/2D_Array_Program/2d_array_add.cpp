// Write a c++ program to add 2 2-d array into 3 array

#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;
void add(int arr1[r][c], int arr2[r][c])
{
    int arr3[r][c];
    int i, j;

    // Taking input from user of first array
    cout << "Enter the first array element:\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cin >> arr1[i][j];
        }
    }

    // Taking input from user of second array
    cout << "Enter the second array element:\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cin >> arr2[i][j];
        }
    }

    // Displaying the first array element
    cout << "\n"
         << "First Array element are...\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t " << arr1[i][j];
        }
        cout << "\n";
    }

    // Displaying the second array element
    cout << "\n"
         << "Second array element are...\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t " << arr2[i][j];
        }
        cout << "\n";
    }

    // Logic to add two array element withy each other
    cout << "\n"
         << "Then add two num are....\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            arr3[i][j] = arr1[i][j] + arr2[i][j];
        }
    }

    // Displaying the output of the array
    cout << "\n"
         << "Addition of 2-d array are = \n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t " << arr3[i][j];
        }
        cout << "\n";
    }

    // Logic to sum of all the array element
    int sum = 0;
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            sum += arr3[i][j];
        }
    }

    // Displaying the total sum of addition array
    cout << "Total addition of two dimensional array are = " << sum;
}

int main()
{
    int arr1[r][c], arr2[r][c];
    int i, j;
    add(arr1, arr2);
    return 0;
}