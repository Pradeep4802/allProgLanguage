#include <stdio.h>

int main()
{
    const char *fun();
    const char *p;

    p = fun();
    // *p = 'A';
    printf(" %s", p);
}

const char *fun()
{
    return "Rain";
}