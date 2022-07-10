// Write a c++ code to add 2 number at same index number

#include <iostream>
using namespace std;
const int row = 2;
const int col = 2;

void user_input(int arr1[][col]);
void show_input(int arr2[][col]);
void add_input(int arr1[][col], int arr2[][col], int arr3[][col]);

int main()
{
    int arr1[row][col], arr2[row][col], arr3[row][col];
    int result;

    cout << "\n Enter the first array element of " << row
         << "x: "
         << col;
    user_input(arr1);

    cout << "\n Enter the second array element of " << row
         << "x: "
         << col;
    user_input(arr2);

    cout << "\n Display the first array element...";
    show_input(arr1);

    cout << "\n Display the second array element...";
    show_input(arr2);

    add_input(arr1, arr2, arr3);

    cout << "\nSum of first and second matrix: \n";
    show_input(arr3);
}

void user_input(int arr1[][col])
{
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            cin >> *(*(arr1 + i) + j);
        }
    }
}

void show_input(int arr2[][col])
{
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            cout << *(*(arr2 + i) + j)
                 << "\t";
        }
        cout << "\n";
    }
}

void add_input(int arr1[][col], int arr2[][col], int arr3[][col])
{
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            *(*(arr3 + i) + j) = *(*(arr1 + i) + j) + *(*(arr2 + i) + j);
        }
    }
}
