#include <stdio.h>
#include <string.h>

int main()
{
    static char *s[] = {
        "ice",
        "green",
        "cone",
        "please"};

    static char **ptr[] = {s + 3, s + 2, s + 1, s};

    char ***p = ptr;

    printf("\n%s", **++p);
    printf("\n%s", *--*++p + 3);
    printf("\n%s", *p[-2] + 3);
    printf("\n%s", p[-1][-1] + 1);
    return 0;
}