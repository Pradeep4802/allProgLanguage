#include<stdio.h>
#include<string.h>

int main()
{
    char s[] = "Oinks Grunts and Guffaws";

    printf("\n%c",*(&s[2]));
    printf("\n%s",s + 5);
    printf("\n%s",s);
    printf("\n%c",*(s+2));
    printf("\n%u",s);
    return 0;
}