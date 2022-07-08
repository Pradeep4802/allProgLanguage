#include<stdio.h>
#include<string.h>

int main()
{
    char str1[25];
    int len1,len2;

    printf("Enter the string: ");
    gets(str1);
    len1 = strlen(str1);
    len2 = strlen("HumptyDumpty");

    printf("The length of the string 1st is : %d\n ",len1);
    printf("The length of the string 2nd is : %d ",len2);
    return 0;
}