#include <stdio.h>

struct student
{
    int roll;
    char name[10];
};

int main()
{
    struct student s1[3];
    struct student *ptr;
    ptr = s1;

    for (int i = 0; i < 3; i++)
    {
        scanf("%d %s", &ptr->roll, ptr->name);
        ptr++;
    }
    ptr = s1;
    for (int i = 0; i < 3; i++)
    {
        printf("\n Name = %s\t Roll = %d", ptr->name, ptr->roll);
        ptr++;
    }

    return 0;
}