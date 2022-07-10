#include<stdio.h>

int main()
{
    int a[3][3] = {6,2,5,0,1,3,4,9,8};
    int *p;
    p = &a[0][0];

    // printf("%d\n",a);
    // printf("%d\n",a+1);
    // printf("%d\n",a+2);
    // printf("%d\n",*a[0]);
    // printf("%d\n",a[0]+1);
    // printf("%d\n",a[0]+2);
    // printf("%d\n",*p);

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            printf("%d\t",a+i+j);
        }
        printf("\n");
    }
      
    return 0;
}