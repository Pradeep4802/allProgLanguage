#include<stdio.h>

int main()
{
    char str1[] = "Klinsman";

    int i = 0;
    while(str1[i] != '\0')
    {
        printf(" %c %c %c %c\n",*(str1+i),*(i+str1),str1[i],i[str1]);
        i++;
    }
}