// Write a C program to find length of string using pointers.

#include <iostream>
#include <stdio.h>
using namespace std;

int xstrlen(char *p)
{
    int count = 0;
    while (*(p)++)
    {
        count++;
    }
    return count;
}

int main()
{
    char str[20];
    int tot;

    cout << "\n Enter the string: ";
    gets(str);

    tot = xstrlen(str);

    cout << "\n Total Length of the string ' " << str << " ' is : " << tot;
    return 0;
}