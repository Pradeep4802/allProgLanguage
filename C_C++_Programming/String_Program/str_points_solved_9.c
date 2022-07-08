#include<stdio.h>
#include<string.h>

int main()
{
    char *str[] = {"Frogs","Do","Not","Eat","They","Croak!"};
    printf("\n %d %d",sizeof(str),sizeof(str[0]));
    return 0;
}