#include<iostream>
using namespace std;

void print(int arr[],int len) {
    if(len == 0 ) {
        return;
    }
    static int i = 0;
    cout << arr[i] << ", ";
    i++;
    print(arr,len-1);
}

int main() {
    int arr[] = {1,3,5,9,7};
    int len = sizeof(arr)/sizeof(arr[0]);

    print(arr,len);
    return 0;
}

