#include <stdio.h>
#include <string.h>

int main()
{
    // char str[6][30] = {
    //     "Don't walk in front of me...",
    //     "I may not follow;",
    //     "Don't walk behind me...",
    //     "I may not lead",
    //     "Just walk beside me...",
    //     "And be my friend."
    // };
    // printf("\n%c %c",*(str[2] + 9), *(*(str + 2) + 9));

    char *ptr = "Hello World";
    printf("%.7s",ptr);
    return 0;
}