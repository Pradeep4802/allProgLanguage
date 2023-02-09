#include <iostream>
using namespace std;
// void revPrint(int arr[]. int index);

void print(int arr[], int len, int index)
{
    // base
    if (index == len)
    {
        return;
    }
    // ek case solve
    print(arr, len, index+1);
    cout << arr[index] << ", ";
    // index-=1;

    // Recursive call
}

void revPrint(int arr[], int index) {
    //base case
    if(index < 0) {
        return;
    }
    cout << arr[index] << ", ";

    // R,R
    revPrint(arr, index-1);

}

int main()
{
    int arr[] = {1, 3, 5, 7};
    int len = sizeof(arr) / sizeof(arr[0]);
    revPrint(arr, len-1);
    // print(arr, len, 0);
    cout << endl;
    return 0;
}
