#include <stdio.h>

struct student
{
    int no;
    char name;
    int marks[3];
    int total;
} s[3];

int main()
{
    int n;
    int i, k, j, l;

    // printf("\n Enter How many element that you want:>>");
    // scanf("%d", &n);

    for (i = 0; i < 3; i++)
    {
        printf("\nEnter the Number:>>");
        scanf("%d", &s[i].no);

        printf("\nEnter the Name:>>");
        scanf("%s", &s[i].name);

        for (j = 0; j < 3; j++)
        {
            printf("\nMarks#%d:>> ", j);
            scanf("%d", &s[i].marks[j]);
        }
        for (k = 0; k < 3; k++)
        {
            s[k].total = 0;
            for (l = 0; l < 3; l++)
            {
                s[i].total = s[i].total + s[i].marks[k];
            }
        }
    }

    printf("\n\n\n\t\t\t STUDENT TABULAR FORMATE");
    printf("\n\n-----------------------------------------------------------------");
    printf("\n\t  No  \t\t\t  Name  \t\t  Total");
    for (i = 0; i < 3; i++)
    {
        printf("\n\n\n%d\t\t%s\t\t\t%d", s[i].no, s[i].name, s[i].total);
    }

    return 0;
}