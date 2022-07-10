// #include <stdio.h>

// int main()
// {
//     int i = 10;
//     char ch = 'A';
//     float a = 3.14;
//     char str[20];

//     printf("%d %c %f\n", i, ch, a);
//     sprintf(str, "%d %c %f\n", i, ch, a);
//     printf("%s\n", str);
//     return 0;
// }

#include <stdio.h>

int main()
{

    char ch;

    printf("\nType any alphabet:");
    ch = getchar();
    printf("You typed:");
    putchar(ch);
    return 0;
}