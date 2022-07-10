#include<stdio.h>

int main()
{
    // int a[5];
    // int *q;
    // q=a;
    // int i;

    // for ( i = 0; i < 5; i++)
    // {
    //     scanf("%d",&q[i]);
    // }
    
    // for (i=0;i<5;i++)
    // {
    //     printf("Result = %d\n",i[q]);
    // }
    int i,j;
    int a[3][3] = {6,2,5,0,1,3,4,9,8};
    int *p;
    p = &a[0][0];  // p = a[0];
    for ( i = 0; i < 3; i++)
    {
        for ( j = 0; j < 3; j++)
        {
        
            printf("Result = %d\n",*(a+i)); // p/a/&a[0][0] / &a / *a / a[0]
        }        
    }
    
} 