#include<stdio.h>
#include<string.h>

int main()
{
    char s[20];
    int i;

    for ( i = 0; i < 19; i++)
    {
        *(s + i) = 67;
    }
    *(s + i) = '\0';
    printf(" %s",s);
    printf("\n");
    return 0;
}