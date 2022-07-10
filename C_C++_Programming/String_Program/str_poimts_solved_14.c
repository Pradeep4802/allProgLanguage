#include<stdio.h>
#include<string.h>

int main()
{
    char *s[] = {
        "ice",
        "green",
        "cone",
        "please"
    };

    printf("%s",s+3);
    return 0;
}        