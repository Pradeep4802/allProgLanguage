// Write a C++ Program to reverse the given string

#include <iostream>
#include <stdio.h>
#include <string.h>
using namespace std;

void xstrrev(char *ptr1, char *ptr2)
{
    printf("%d\n",ptr1);
    printf("%d\n",++ptr1);
    printf("%d",ptr1);
    int count = 0;
    while (*ptr1++ != '\0')
    {
        count++;
    }
    cout << "\n Length of the string : " << count <<"\n";
    // int i = count;
    printf("%d\n",ptr1);
    ptr1--;
    printf("%d\n",ptr1);
    while (count >= 0)
    {
        *(ptr2++) = *(--ptr1);
        count--;
    }
    *ptr2 = '\0';
}
int main()
{
    char str1[20];
    char str2[20];

    cout << "\n Enter the string1: ";
    gets(str1); // fgets(str1, 20, stdin);

    printf("%d\n", str1);
    printf("%d\n", str2);
    xstrrev(str1, str2);

    cout << "\n Original String is " << str1;
    cout << "\n Reverse String is " << str2
         << "\n";
    return 0;
}