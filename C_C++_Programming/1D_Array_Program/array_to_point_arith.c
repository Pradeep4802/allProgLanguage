#include <stdio.h>

int main()
{
    int arr[] = {10, 20, 30, 45, 67, 56, 74};
    int i = 4, *j, *k, *x, *y;
    j = &i;
    printf("j = %d\n", j);
    j = j + 9;
    printf("j = %d\n", j);
    k = &i;
    printf("k = %d\n", k);
    k = k - 3;
    printf("k = %d\n", k);
    x = &arr[1];
    printf("x = %d\n", x);
    y = &arr[6];
    printf("y = %d\n", y);
    printf("%d\n", y - x);
    i = &arr[4];
    k = (arr + 4);
    if (j == k)
    {
        printf("The two pointers point to same location.\n");
    }
    else
    {
        printf("The two pointers point to different location");
    }
    return 0;
}