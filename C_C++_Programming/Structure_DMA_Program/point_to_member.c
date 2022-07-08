#include <stdio.h>

struct student
{
    char *name;
    int *roll;
    char gender;
    int marks[5];
};

int main()
{
    int alexRoll = 44;
    struct student stu1 = {"Alex", &alexRoll, 'M', {56, 78, 98, 78, 65}};

    printf("Name:>> %s", stu1.name);
    printf("\nRoll No:>> %d", *(stu1.roll));
    printf("\nGender:>> %c\n", stu1.gender);
    printf("Marks:>>\n");
    for (int i = 0; i < 5; i++)
    {
        printf("\t %d", stu1.marks[i]);
    }

    return 0;
}