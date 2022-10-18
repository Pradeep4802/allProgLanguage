// Wirte a code to find maximum and minimum of the element in the array.
// array --> {4,12,8,10}
// o/p Max --> 12 , Min --> 4

#include <iostream>
using namespace std;
// const int INT_MAX = 32766;
// const int INT_MIN = -32767;
int findMax(int[],int);
int findMin(int[],int);

int main()
{
    int size;
    cin >> size;

    int arr[100];

    // int n = sizeof(arr) / sizeof(int);
    // taking input from user
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }

    cout << "Maximum Number is : " << findMax(arr, size) << endl
         << "Minimum Number is : " << findMin(arr, size) << endl;
    return 0;
}

int findMax(int arr[], int size)// FUnction definition
{
    int max = INT16_MIN;
    for (int i = 0; i < size; i++)
    {
        if (max < arr[i])
            max = arr[i];
    }
    return max;
}

int findMin(int arr[], int size) // FUnction definition
{
    int min = INT16_MAX;
    for (int i = 0; i < size; i++)
    {
        if (min > arr[i])
            min = arr[i];
    }
    return min;
}
// Array
