#include <stdio.h>

struct student
{
    int roll;
    char name[10];
};

int main()
{
    struct student stu1[10];
    int n;
    int i;
    printf("\n Enter the number of element: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++)
    {
        printf("\n Student#:%d:Rollno and Name: ", i);
        scanf("%d %s", &stu1[i].roll, stu1[i].name);
    }
    printf("\n you have entered: ");
    for (i = 0; i < n; i++)
    {
        printf("\nStudent#%d: \nRoll No: %d\nName: %s", i, stu1[i].roll, stu1[i].name);
    }

    return 0;
}