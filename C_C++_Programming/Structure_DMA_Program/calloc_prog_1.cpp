#include <iostream>
using namespace std;

int main()
{
    int *p;
    int n;
    int arr[10];
    // p = arr;
    // give the size of an array
    cout << "\n"
         << "Enter the size of an array : ";
    cin >> n;
    // Allocate the memory using calloc
    p = (int *)calloc(n, sizeof(int));

    // check the memory is allocated successfully using calloc function or not
    if (p == NULL)
    {
        cout << "\n"
             << "Out of Memory.";
        exit(0);
    }
    else
    {
        cout << "\n"
             << "Memory allocated successfully by calloc.";

        // Memory allocated successfully
        for (int i = 0; i < n; i++)
        {
            p[i] = i + 1;
        }

        // print the element
        for (int i = 0; i < n; i++)
        {
            cout << "\n"
                 << p[i];
        }
        return 0;
    }
}