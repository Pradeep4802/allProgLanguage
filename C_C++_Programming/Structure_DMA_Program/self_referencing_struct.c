#include <stdio.h>

struct student
{
    char name[20];
    int roll;
    char gender;
    int marks[5];
    struct student *next;
};

int main()
{
    struct student stu1 = {"Alex", 43, 'M', {76, 98, 68, 87, 93}, NULL};
    struct student stu2 = {"Max", 33, 'M', {87, 84, 82, 96, 78}, NULL};
    // stu1.next = &stu2;
    // printf("Name: %s\n", stu1.next->name);
    // printf("Roll: %d\n", stu1.next->roll);
    // printf("Gender: %c\n", stu1.next->gender);

    // for (int i = 0; i < 5; i++)
    //     printf("Marks in %dth subject: %d\n", i, stu1.next->marks[i]);

    struct student stuBetween = {"Gasly", 23, 'M', {83, 64, 88, 79, 91}, NULL};
    stu1.next = &stuBetween;
    stuBetween.next = &stu2;

    printf("Roll Of %s: %d\n", stu1.next->name, stu1.next->roll);
    printf("Gender Of %s: %c\n", stu1.next->next->name, stu1.next->next->gender);
}