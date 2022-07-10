#include <stdio.h>

int compare(int a, int b)
{
    if (a > b)
        return -1;
    else
        return 1;
}

void bubbleSort(int A[], int n, int (*compare)())
{
    int i, j, temp;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < i; j++)
        {
            if (compare(A[j], A[j + i]) > 0)
            {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
    }
}

int main()
{
    int i, A[] = {2, 4, 3, 7, 5, 6};
    bubbleSort(A, 6, compare);
    for (int i = 0; i < 6; i++)
    {
        printf("%d ", A[i]);
    }
}