#include<iostream>
using namespace std;

int findUnique(int *arr, int size)
{
    int ans = 0;
    
    for(int i = 0; i<size; i++) {
        ans = ans^arr[i];
    }
    return ans;
}

int main() {
    int arr[] = {2,3,9,6,3,6,2};
    int len = sizeof(arr)/sizeof(arr[0]);

    cout << findUnique(arr,len); 
    return 0;
}
