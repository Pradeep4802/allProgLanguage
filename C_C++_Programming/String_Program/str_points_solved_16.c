#include<stdio.h>
#include<string.h>

int main()
{
    char str[20];
    printf("\n Enter the string: ");
    gets(str);
    char *p;
    p = str + strlen(str);

    for (; p >= str; p--)
    {
        printf("%c",*p);
    }
    return 0;
}