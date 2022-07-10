#include <iostream>
using namespace std;

const int r = 3;
const int c = 3;

void diagonal(int arr1[r][c])
{
    int i, j;
    cout << "Enter the element:";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cin >> arr1[i][j];
        }
    }

    // Displaying the first array element
    cout << "Displaying the matrix form table\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t " << arr1[i][j];
        }
        cout << "\n";
    }

    int major = 0;
    int minor = 0;

    // Logic to add major and minor diagonal
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            if (i == j)
            {
                major += arr1[i][j];
            }
            else if (i + j == r)
            {
                minor += arr1[i][j];
            }
        }
    }

    // Taking total of major and minor diagonal
    cout << "Addition of major diagonal = " << major;
    cout << "\nAddition of minor diagonal = " << minor
         << "\n";
}
int main()
{
    int arr1[r][c];
    diagonal(arr1);
    return 0;
}