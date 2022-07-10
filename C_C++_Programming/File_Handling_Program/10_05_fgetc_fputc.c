#include <stdio.h>

int main()
{
    FILE *ptr;
    // fgetc demo for reading a file
    // int i = 1;
    // char c;
    // ptr = fopen("getcdemo.txt", "r");
    // c = fgetc(ptr);
    // printf("The value of my character is %c\n", fgetc(ptr));
    // printf("The value of my character is %c\n", fgetc(ptr));
    // printf("The value of my character is %c\n", fgetc(ptr));
    // printf("The value of my character is %c\n", fgetc(ptr));
    // printf("The value of my character is %c\n", fgetc(ptr));

    ptr = fopen("putcdemo.txt", "w");
    fputc('c',ptr);
    fputc('c',ptr);
    fputc('c',ptr);

    fclose(ptr);
    return 0;
}