#include<stdio.h>
#include<string.h>

int main()
{
    char source[] = "Pradeep is a great programmer.";
    char target[30];

    printf("Source string are : %s\n",source);
    strcpy(target,source);
    printf("target string are : %s\n",target);
    return 0;
}