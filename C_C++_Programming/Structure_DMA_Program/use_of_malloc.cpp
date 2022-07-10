#include<iostream>
using namespace std;

int main()
{
    int *ptr1;
    ptr1 = (int*)malloc(3*sizeof(int));

    if (ptr1==NULL)
    {
        cout << "Memory not allocated.\n";
    }
    else{
        cout << "Memory allocated successfully. \n";
        cout << "The address of the pointer is : \n" << ptr1;

        for (int i = 0; i < 3; i++)
        {
            ptr1[i] = i;
        }
        
        for (int i = 0; i < 3; i++)
        {
            cout << "\n"
                << ptr1[i];
        }
        
    }
    return 0;  
}