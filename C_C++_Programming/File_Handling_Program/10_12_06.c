#include<stdio.h>

int main()
{ 
    FILE *ptr;
    FILE *ptr1;
    int num;
    ptr = fopen("ind_01.txt","r");
    ptr1 = fopen("pr_06_1.txt","w");
    fscanf(ptr,"%d",&num);
    printf("The number is : %d",num);

    fprintf(ptr1,"The number is a of : %d", (num*2));

    // fclose(ptr);
    fclose(ptr);
    fclose(ptr1);
    return 0;
}