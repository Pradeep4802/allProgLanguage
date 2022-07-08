#include <stdio.h>

struct example
{
    int i;
    void (*ptrMessage)(int i);
};

void message(int);
int main()
{
    struct example eg1 = {6, message};
    eg1.ptrMessage(eg1.i);
}
void message(int i)
{
    printf("Hello, I'm a member of a structure. This structure also has an integer with value %d", i);
}