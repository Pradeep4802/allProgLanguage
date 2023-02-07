#include <iostream>
using namespace std;

void print(int arr[], int len, int index)
{
    // base
    if (index == len)
    {
        return;
    }
    // ek case solve
    cout << arr[index] << ", ";

    // Recursive call
    print(arr, len, index + 1);
}

int main()
{
    int arr[] = {1, 3, 5, 9, 7};
    int len = sizeof(arr) / sizeof(arr[0]);

    print(arr, len, 0);
    cout << endl;
    return 0;
}
