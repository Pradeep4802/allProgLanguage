#include<stdio.h>
#include<string.h>

int main()
{
    char *names[] = {
        "Some love one",
        "Some love two",
        "I love one",
        "That is you"
    };

    printf("\n %d %d", sizeof(names), sizeof(names[2]));
    return 0; 
}