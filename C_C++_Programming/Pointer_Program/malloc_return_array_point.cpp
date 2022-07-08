#include <stdio.h>
#include <iostream>
#include <malloc.h>
#include <stdlib.h>
using namespace std;
int *getarray()
{
    int size;
    cout << "Enter the size of the array : ";
    cin >> size;
    int *p = (int *)malloc(size * sizeof(int));
    cout << "\nEnter the elements in an array";
    for (int i = 0; i < size; i++)
    {
        cin >> p[i];
    }
    return p;
}
int main()
{
    int *ptr;
    ptr = getarray();
    int length = sizeof(*ptr);
    //    printf("\n%d",length);
    cout << "Elements that you have entered are : ";
    for (int i = 0; i <= ptr[i]; i++)
    {
        cout << "\n"
             << ptr[i];
    }
    free(ptr);
    return 0;
}