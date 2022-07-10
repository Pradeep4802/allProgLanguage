#include <stdio.h>

struct book
{
    char name[25];
    char author[25];
    int callno;
};

int main()
{
    struct book b1 = {"Let us C", "BpB", 101};
    struct book *ptr = &b1;

    printf("%s %s %d\n", b1.name, b1.author, b1.callno);
    printf("%s %s %d\n", ptr->name, ptr->author, ptr->callno);
    printf("%s %s %d\n", (*ptr).name, (*ptr).author, (*ptr).callno);
    return 0;
}
