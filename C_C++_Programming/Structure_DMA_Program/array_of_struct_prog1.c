#include <stdio.h>

struct student
{
    char name[20];
    double roll;
    char gender;
    int marks[5];
};

int main()
{
    struct student s1[4];
    int i;
    int j;

    for (i = 0; i < 4; i++)
    {
        printf("\n Enter the Name, Roll, Gender : \n");
        scanf("%s %f %c", &s1[i].name, &s1[i].roll, &s1[i].gender);
        printf("\n Enter the marks : ");
        for (j = 0; j < 5; j++)
        {
            scanf("%d", &s1[i].marks[j]);
        }
    }

    // Finding the average of the marks
    for (i = 0; i < 4; i++)
    {
        float sum = 0;
        for (j = 0; j < 5; j++)
        {
            sum += s1[i].marks[j];
        }
        printf("Name: %s\nAverage Marks = %.2f\n\n", s1[i].name, sum / 5);
    }

    return 0;
}