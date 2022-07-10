// Write a C++ Program to concatenate two strings using pointers.

#include <iostream>
#include <stdio.h>
#include <string.h>
using namespace std;

void xstrcat(char *ptr1, char *ptr2)
{
    while (*(ptr1)++ = *(ptr2)++)
        ;
}

int main()
{
    char str1[20];
    char str2[20];

    printf("\n Enter the string: ");
    gets(str1);

    printf("\n Enter the string: ");
    gets(str2);

    xstrcat(str1, str2);
    return 0;
}