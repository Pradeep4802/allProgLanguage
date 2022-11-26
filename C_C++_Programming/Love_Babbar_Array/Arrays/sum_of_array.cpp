#include<iostream>
using namespace std;

int sumArray(int num[], int size) {
    int sum = 0;
    for(int i = 0; i < size; i++) {
        sum += num[i];
    }
    return sum;
}

int main() {
    int size;
    cout << "Enter the size of the array: ";
    cin >> size;

    int arr[50];
    cout << "Taking the input into the array: ";
    for (int i = 0; i < size; i++)
    {
        cin >> arr[i];
    }
    
    cout << "Sum of the array are: " << sumArray(arr, size);
    return 0;
}