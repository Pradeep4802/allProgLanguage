//
// Created by Pradeep on 22-08-2021.
//

#include<stdio.h>

int main()
{
    int s[4][2];
    int (*p)[2];
    int i,j,*pint;
//	int i;
    for (i = 0; i < 4; i++) {
        for (j = 0; j < 2; j++) {
            scanf ( "%d" , &s[i][j]);
        }
    }
    for (i = 0; i < 4; i++) {
        p = &s[i];
        pint = (int*)p;  
        printf("\n");
        for (j = 0; j < 2; j++) {
            printf("%d",*(pint + j));
        }
    }
    return 0;
}

