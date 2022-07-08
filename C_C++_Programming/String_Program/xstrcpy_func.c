#include <stdio.h>
// #include<string.h>

void xstrcpy(char *, const char *);
int main()
{
    char src[] = "Brahmastra";
    char target[20];

    xstrcpy(target, src);
    printf("Source string are : %s\n", src);
    printf("target string are : %s\n", target);
}

void xstrcpy(char *t, const char *s)
{
    // int i = 0;
    // *s = 'k';
    while (*s != '\0')
    {
        *t = *s;
        s++;
        t++;
    }
    *t = '\0';
}