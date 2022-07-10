#include <iostream>
using namespace std;

void deletion(int a[], int n, int index)
{
    cout << "Enter the element in the array: " << endl;
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    cout << endl << "Array before deletion:";
    for (int i = 0; i < n; i++)
    {
        cout << endl
             << a[i];
    }

    // logic to delete the element from the array
    for (int i = index-1; i < n-1; i++)
    {
        a[i] = a[i + 1];
    }
    n--;
    cout << endl <<  "Array after deletion";
    for (int i = 0; i < n; i++)
    {
        cout << endl
             << a[i];
    }
}

int main()
{
    int a[20];
    int size;
    int pos;

    cout << "Enter the size of the array: " << endl;
    cin >> size;

    cout << "\n Enter the position where to delete the element in the array: ";
    cin >> pos;

    deletion(a, size, pos);
    return 0;
}