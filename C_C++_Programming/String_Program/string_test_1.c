// #include <stdio.h>

// // void printStr(char s[]);
// void printStr(char s[])
// {
//     int i = 0;
//     while (s[i] != '\0')
//     {
//         printf("%c", s[i]);
//         i++;
//     }
// }
// int main()
// {
//     char st[] = {'p', 'r', 'a', 'd', 'e', 'e', 'p', '\0'};

//     printStr(st);
// }

// #include <stdio.h>

// void printStr(char str[])
// {
//     int i=0;
//     while(str[i]!='\0')
//     {
//         printf("%c", str[i]);
//         i++;
//     }
//     printf("\n");
// }
// int main()
// {
//     char str[] = {'h', 'a', 'r', 'r', 'y'};
//     // char str[6] = "harry";
//     // char str[34];
//     // gets(str);
//     printf("Using custom function printStr\n");
//     printStr(str);
//     printf("Using printf %s\n", str);
//     printf("using puts: \n");
//     puts(str);
//     return 0;
// }

#include<stdio.h>
 
int main()
{
    // char str1[] = "Hello";
    // char str2[10];

    // char *s = "Good Morning";
    // char *q;

    // // str2 = str1;
    // q = s;

    // printf("\n%s",*q);

    char *p = "Hello";
    // char *ptr;
    p = "bye";
    // *p = 'M';
    // *p = "Bye";
    for (; *p != '\0'; )
    {
        printf(" %c",*p);
        p++;
    }
    
    return 0;
}
