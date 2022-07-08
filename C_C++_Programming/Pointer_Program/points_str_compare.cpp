#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;

int xstrcmp(char *ptr1, char *ptr2)
{
    while ((*ptr1 && *ptr2) && (*ptr1 == *ptr2))
    {
        ptr1++;
        ptr2++;
    }
    
    return *ptr1 - *ptr2;
}

int main()
{ 
    char str1[20];
    char str2[20];
    int result;

    cout << "\n Enter the string1:";
    cin >> str1;

    cout << "\n Enter the string2:";
    cin >> str2;


    result = xstrcmp(str1, str2);

    if (result == 0)
    {
        cout << "\n Both String are equal.";
    }
    
    else if (result < 0)
    {
        cout << "\n String 1 is smaller than string 2.";
    }
    
    else
    {
        cout << "\n String 1 is greater than string 2.";
    }
    return 0; 
}