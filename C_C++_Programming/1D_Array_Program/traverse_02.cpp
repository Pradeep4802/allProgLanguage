#include<iostream>
using namespace std;

int main()
{
    int a[50];
    int size;
    cout << "\n Enter the size of array: ";
    cin >> size;

    for (int i = 0; i < size; i++)
    {
        cin >> a[i];
    }

    cout << endl << "Elements in array ae: ";

    for (int i = 0; i < size; i++)
    {
        cout << a[i] << endl;    
    }
    
    
    return 0;
}