// Write a C++ program to copy one string to another using pointers.

#include <iostream>
#include <stdio.h>
using namespace std;

void xstrcpy(char *ptr1, char *ptr2)
{

    while (*(ptr2)++ = *(ptr1)++)
        *ptr2 = '\0';
}

int main()
{
    char str1[20];
    char str2[20];

    cout << "\n Enter the string: ";
    gets(str1);

    cout << "\n Original String are: " << str1;

    xstrcpy(str1, str2);

    cout << "\n Copy string are : " << str2;

    return 0;
}