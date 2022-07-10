#include <stdio.h>
#include <string.h>

int main()
{
    char str[3][20];
    int i;

    for (i = 0; i < 3; i++)
    {
        printf("\nEnter the Name: ");
        scanf("%s", str);
        printf("You have entered: %s", str);
    }
    return 0;
}