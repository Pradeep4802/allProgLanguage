// Write a c++ programm to conactenate two strings using pointers

#include <iostream>
#include <stdio.h>
#include <string.h>
using namespace std;

void xstrcat(char *ptr1, char *ptr2)
{
    while (*(++ ptr1))
        ;
    while (*ptr1++ = *ptr2++)
        ;
}

int main()
{
    char str1[40];
    char str2[40];

    cout << "\n Enter the string 1: ";
    gets(str1);

    cout << "\n Enter the string 2: ";
    gets(str2);

    cout << "\n Original String are: " << str1;

    xstrcat(str1, str2);

    cout << "\n Concatenate String are: " << str1;
    return 0;
}