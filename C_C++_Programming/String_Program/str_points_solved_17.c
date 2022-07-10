#include<stdio.h>
#include<string.h>

int main()
{
    char a[] = "Able was I ere I saw elbA";
    char *t,*s,*b;
    s = a;
    b = a + strlen(a) - 1;
    // t = b;
    while (s != b)
    {
        printf ( "%c", *s);
        s++;
        printf("%c",*b);
        b--;
    }
    return 0;

}

