#include<iostream>
using namespace std;
void l_search(int a1[],int ind,int);
int main()
{
    int arr[10];
    int n;
    int data;
    cout << "Enter the size of the array: ";
    cin >> n;
    cout << endl << "Enter the element in the array: ";
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    cout << endl << "Enter the number that you want to search: ";
    cin >> data;   
    l_search(arr, data, n);
    return 0;
}

void l_search(int a1[], int val, int n) {
    int found = 0;
    for (int i = 0; i < n; i++)
    {
        if (a1[i] == val)
        {
            cout << endl << "Elements found at index : " << i << endl;
            found = 1;
        }
    }
    if (found == 0)
    {
        cout << endl << "Element was not found.";
    }
}