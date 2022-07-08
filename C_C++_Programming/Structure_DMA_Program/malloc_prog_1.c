#include <stdio.h>
#include "malloc.h"
#include <stdlib.h>
int main()
{
    int n, avg, sum = 0, *p[3];

    // p = arr;
    printf("Enter the size of the array: ");
    scanf("%d", n);

    *p = (int *)malloc(n * sizeof(int));

    if (p == NULL)
    {
        printf("Memory Allocation Unsuccessful.");
        // exit();
    }

    for (int i = 0; i < n; i++)
    {
        scanf("%d", (p + i));
    }

    for (int i = 0; i < n; i++)
    {
        sum = sum + *(p + i);
    }

    avg = sum / n;
    printf("Average marks = %d", avg);

    return 0;
}