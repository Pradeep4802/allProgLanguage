#include <stdio.h>
#include <string.h>

int main()
{
    char str1[] = "Hello";
    char str2[] = "Hello";

    if (str1 == str2)
    {
        printf("\n Equal");
    }
    else
    {
        printf("\n Unequal");
    }

    printf("\n %d", strcmp(str1, str2));
    return 0;
}