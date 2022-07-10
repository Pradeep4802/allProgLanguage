#include<stdio.h>
#include<string.h>

int main()
{
    // char str1[] = "Jerry";
    // char str2[] = "Ferry";

    // int i,j,k;
    // i = strcmp(str1,"Jerry");
    // j = strcmp(str1,str2);
    // k = strcmp(str1,"Jerry boy");

    // printf("\n %d %d %d",i,j,k);

    // char c[2] = "A";
    // printf("%c\n",c[0]);
    // printf("%s\n",c);

    // char name[] = "Pradeep";
    // printf("\n%s",name);

    char name[25];
    printf("\nEnter your name:");
    scanf("%s",name);
    printf("Hello %s!",name);
    return 0;
}