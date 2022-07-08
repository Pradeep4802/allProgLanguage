#include <stdio.h>
#include <string.h>

int main()
{
    char str[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char *s;

    int i;
    s = str;

    for (i = 0; i <= 9; i++)
    {
        if (*s)
        {
            printf(" %c", *s);
        }
        s++;
    }
    return 0;
}