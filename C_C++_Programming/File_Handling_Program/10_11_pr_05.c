#include<stdio.h>

int main()
{ 
    FILE *ptr;
    FILE *ptr1;
    int num;
    ptr = fopen("pr_05.txt","r");
    ptr1 = fopen("pr_05_1.txt","w");
    fscanf(ptr,"%d",&num);
    fprintf(ptr,"The number is : %d",num);

    fprintf(ptr1,"The number is a of : %d", num*2);

    // fclose(ptr);
    fclose(ptr);
    fclose(ptr1);
    return 0;
}