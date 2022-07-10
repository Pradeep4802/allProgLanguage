#include <stdio.h>
#include <string.h>

struct student
{
    char name[20];
    double roll;
    char gender;
    int marks[5];
} st1, st2;

void main()
{
    struct student st1 = {"Alex", 43, 'M', {76, 78, 56, 98, 92}};
    struct student st2 = {"Max", 33, 'M', {87, 84, 82, 96, 78}};

    if (strcmp(st1.name, st2.name) == 0 && st1.roll == st2.roll)
        printf("Both are the records of the same student.\n");
    else
        printf("Different records, different students.\n");

    /* Copiying the structure variable */
    st2 = st1;

    if (strcmp(st1.name, st2.name) == 0 && st1.roll == st2.roll)
        printf("\nBoth are the records of the same student.\n");
    else
        printf("\nDifferent records, different students.\n");
    return 0;
}