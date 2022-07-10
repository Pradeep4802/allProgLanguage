#include<stdio.h>

void PrintHello(char* name)
{
    printf("Hello %s\n",name);
}

int Add(int a,int b)
{
    return a+b;
}

// int *Func(int, int);  //declaring a function that would return int* 
// int (*Func)(int, int);  //declaring a function pointer 

int main()
{
    // int c;
    // int  (*p)(int, int);
    // p = Add;   // function name will return us pointer.
    // c = p(2,3);   // dereferencing and executing the function
    // printf("%d",c);

    void (*ptr)(char*);
    ptr = PrintHello;
    ptr("Pradeep");
    return 0;
}