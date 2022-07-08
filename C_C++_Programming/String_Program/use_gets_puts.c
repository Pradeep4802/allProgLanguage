#include<stdio.h>

int main()
{
    int name[25];
    printf("Enter the name: ");
    // gets(name);
    scanf("%[^\n]s",name);
    puts("Hello!");
    puts(name);
    return 0;
}