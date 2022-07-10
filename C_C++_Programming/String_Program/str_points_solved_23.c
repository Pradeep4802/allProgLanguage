#include <stdio.h>
#include <string.h>

int main()
{
    char names[5][20] = {
        "Roshani",
        "Manish",
        "Mona",
        "Bajju",
        "Ritu"
    };
    int i;
    char *t;
    t = names[3];
    names[3] = names[4];
    names[4] = t;
    for (i = 0; i < 5; i++)
    {
        printf("\n%s",names[i]);
    }
    return 0;
}