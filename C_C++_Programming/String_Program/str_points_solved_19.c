#include <stdio.h>
#include <string.h>

int main()
{
    char s[] = "Lumps, bumps, swollen veins, new pains";
    char t[40];

    char *ss, *tt;
    ss = s;
    tt = t;

    while (*tt++ = *ss++)
        ;
    printf("%s", t); 
    return 0;
}