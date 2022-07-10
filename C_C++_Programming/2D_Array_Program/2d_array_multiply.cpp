#include<iostream>
using namespace std;

const int r = 3;
const int c = 3;

void multiply(int arr1[r][c],int arr2[r][c])
{
    int i,j,k;
    int arr3[r][c];

    // Taking input from user for 1st array
    cout << "Enter the first array element: ";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cin >> arr1[i][j];
        }
    }

    // Taking input from user for 2nd array
    cout << "Enter the second element: ";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cin >> arr2[i][j];
        }
    }

    // Displaying the read of first array element
    cout << "\n Displaying the read input for 1st array:..\n";
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
    cout << "\n Displaying the read input 2nd array:..\n";
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            cout << " \t "
                 << arr2[i][j];
        }
        cout << "\n";
    }

    // logic to do multilication between two array and store into third array
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            // make 0 before counting next iteration 
            arr3[i][j] = 0;
            for ( k = 0; k < 3; k++)
            {
                // counting and storing element into 3rd array 
                arr3[i][j] = arr3[i][j] + arr1[i][k] * arr2[k][j];
            }
        }
    }

    // Display the output of the total multiplication array into 3rd array
    cout<<"Display the multilpied matrix are...\n";
    for ( i = 0; i < r; i++)
    {
        for ( j = 0; j < c; j++)
        {
            cout<<" \t "
                <<arr3[i][j];
        }
        cout<<"\n";
    }
}

int main()
{
    int arr1[r][c],arr2[r][c];
    multiply(arr1,arr2);
    return 0;
}