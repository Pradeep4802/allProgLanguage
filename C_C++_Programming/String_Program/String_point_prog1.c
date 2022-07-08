#include <stdio.h>
#include <string.h>

int main()
{
    // char str1[] = "Hello";
    // // char str2[10];
    // char *p = "Hello";
    // char *q;

    // for (int i = 0; str1[i] != '\0'; i++)
    // {
    //     str2[i] = str1[i];
    //     printf("%c", str2[i]);
    // }

    // str2 = str1;
    // q = p;
    // // printf(str2);
    // for (int i = 0; p[i]!= '\0'; i++)
    // {
    //     printf("%c",q[i]);
    // }
    // str1 = "Bye";
    // p = "Bye";
    // for (int i = 0; p[i] != '\0'; i++)
    // {
    //     printf("%c",p[i]);
    // }

    char str1[25];
    char str2[25];
    printf("Enter the String 1: ");
    gets(str1);

    printf("Enter the String 2: ");
    gets(str2);

    // printf("\n The length of the string are : %d",strlen(str));
    // printf("The lowercase of the name is: %s",strupr(str));

    strcat(str1,str2);
    puts(str1);
    return 0;
}