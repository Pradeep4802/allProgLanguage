#include <iostream>
#include <climits>
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

void print3(int arr[], int size) {
    // base case 
    if(size == 0) {
        return;
    }

    cout << arr[0] << ", ";

    // R.C
    print3(arr+1, size-1);    
}

int getMax(int arr[], int size, int index) {
    // base case
    if(index == size)
        return INT_MIN;

    int ans = arr[index];
    int recAns = getMax(arr, size, index+1);
    return max(ans, recAns);
}

int main()
{
    // int arr[] = {1, 3, 5, 7, 4, 6};
    int arr[] = {7, 2, 15, 9, 21, 18};
    int len = sizeof(arr) / sizeof(arr[0]);

    cout << getMax(arr,len,0);
    // print3(arr,len); 
    // revPrint(arr, len-1);
    // print(arr, len, 0);
    cout << endl;
    return 0;
}
