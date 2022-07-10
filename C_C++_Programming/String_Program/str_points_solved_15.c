#include<stdio.h>
#include<string.h>

int main()
{
    char str[] = "For your eyes only";
    char *p;
    int i;

    for ( p = str,i = 0; p + i <= str + strlen(str); p++, i++)
    {
        printf("%c",*(p + i));
    }
    return 0; 
}