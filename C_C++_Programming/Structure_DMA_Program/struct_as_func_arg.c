// #include <stdio.h>

// struct student
// {
//     char *name;
//     int roll_No;
//     char gender;
//     int marks[5];
// };

// void display(char *a, int roll, char gen, int mark[])
// {
//     printf("\n Name:>> %s", a);
//     printf("\n Roll_No:>> %d", roll);
//     printf("\n Gender:>> %c", gen);

//     for (int i = 0; i < 5; i++)
//     {
//         printf("\n Marks(%d):>> %d", i + 1, mark[i]);
//     }
// }

// int main()
// {
//     struct student s1 = {"Alex", 219414, 'M', {78, 89, 67, 87, 90}};
//     display(s1.name, s1.roll_No, s1.gender, s1.marks[5]);
//     return 0;
// }

// ----------------------------------------------OR-------------------------------------------------------

// #include <stdio.h>

// struct student
// {
//     char *name;
//     int roll_No;
//     char gender;
//     int marks[5];
// };

// void display(struct student s)
// {
//     printf("\n Name:>> %s", s.name);
//     printf("\n Roll_No:>> %d", s.roll_No);
//     printf("\n Gender:>> %c", s.gender);

//     for (int i = 0; i < 5; i++)
//     {
//         printf("\n Marks(%d):>> %d", i + 1, s.marks[i]);
//     }
// }

// int main()
// {
//     struct student s1 = {"Alex", 219414, 'M', {78, 89, 67, 87, 90}};
//     display(s1);
//     return 0;
// }

// ----------------------------------------------OR-------------------------------------------------------

// #include <stdio.h>

// struct student
// {
//     char *name;
//     int roll_No;
//     char gender;
//     int marks[5];
// };

// void display(struct student *p)
// {
//     printf("Name: %s\n", p->name);
//     printf("Roll: %d\n", p->roll_No);
//     printf("Gender: %c\n", p->gender);

//     for (int i = 0; i < 5; i++)
//         printf("Marks in %dth subject: %d\n", i, p->marks[i]);
// }
// void main()
// {
//     struct student stu1 = {"Alex", 43, 'M', {76, 98, 68, 87, 93}};
//     struct student *ptrStu1 = &stu1;
//     display(ptrStu1);
// }

// ----------------------------------------------OR-------------------------------------------------------

#include <stdio.h>

struct student
{
    char name[20];
    int roll_No;
    char gender;
    int marks[5];
};

void display(struct student *p)
{
    for (int j = 0; j < 10; j++)
    {
        printf("Name: %s\n", (p + j)->name);
        printf("Roll: %d\n", (p + j)->roll_No);
        printf("Gender: %c\n", (p + j)->gender);

        for (int i = 0; i < 5; i++)
            printf("Marks in %dth subject: %d\n", i, (p + j)->marks[i]);
        }
}

void main()
{
    struct student stu1[10];
    display(stu1);
}