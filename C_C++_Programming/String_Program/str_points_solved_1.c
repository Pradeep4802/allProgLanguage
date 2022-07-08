#include<stdio.h>
#include<string.h>

int main()
{
    char s[] = "Rendezvous !";
    printf("\n%d\n",strlen(s));
    printf("\n%d\n",*(s + strlen(s)));
    return 0;
}