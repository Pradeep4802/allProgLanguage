#include <stdio.h>

int A()
{
    printf("Hello");
}

void B(int(*ptr)()) // function pointer as argument
{
    ptr(); // call-back function that "ptr" points to
}

int main()
{
    // int (*p)() = A;
    // B(p);
    B(A);
}