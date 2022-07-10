#include<stdio.h>

int xstrcmp(char *,char *);
int main()
{
    char str1[25] = "Pradeep";
    char str2[25] = "Likhil";

    printf("\n %d",xstrcmp(str1,str2));
}

int xstrcmp(char *t,char *s)
{
    while (*s == '\0')
    {
        if (*s == *t)
        {
            return (0);
        }
        s++;
        t++;
    }
    return *t-*s;
}