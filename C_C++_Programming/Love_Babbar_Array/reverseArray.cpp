#include <iostream>
using namespace std;

void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

// Iterative approach to reverse the array
void reverse(int arr[], int n)
{
    int start = 0;
    int end = n - 1;
    while (start < end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    // printArray(arr, n);
}

// Recursive approach to reverse
void reverseArray(int arr[], int start, int end)
{
    if (start >= end)
        return;

    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    // Recursive Function calling
    reverseArray(arr, start + 1, end - 1);
}

int main()
{

    int arr[6] = {1, 4, 0, 5, -2, 15};
    int brr[5] = {2, 6, 3, 9, 4};
    int n1 = sizeof(arr) / sizeof(arr[0]);
    int n2 = sizeof(brr) / sizeof(brr[0]);
    // reverse(arr, 6);
    // reverse(brr, 5);

    reverseArray(arr, 0, n1-1);
    reverseArray(brr, 0, n2-1);

    printArray(arr, 6);
    printArray(brr, 5);

    return 0;
}