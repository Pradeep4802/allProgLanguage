#include <iostream>
using namespace std;

void printArray(int arr[], int len)
{
    for (int i = 0; i < len; i++)
    {
        cout << arr[i] << " ";
    }
}

void swap_alt(int arr[], int len)
{
    // cout << len;
    for (int i = 0; i < len; i += 2)
    {
        if (i + 1 < len)
        {
            swap(arr[i], arr[i + 1]);
        }
    }
}

int main()
{
    int even[] = {5, 2, 9, 4, 7, 6, 1, 0};
    int odd[] = {11, 33, 9, 76, 43};
    int len1 = sizeof(even) / sizeof(even[0]);
    int len2 = sizeof(odd) / sizeof(odd[0]);

    swap_alt(even, len1);
    printArray(even, len1);

    cout << endl;

    swap_alt(odd, len2);
    printArray(odd, len2);
    return 0;
}