#include <stdio.h>
#include <string.h>

int main()
{
    char s[] = "CStrings";
    for (int i = 0; s[i]; i++)
        printf("\n%c %c %c %c", s[i], *(s + i), i[s], *(i + s));
    return 0;
}