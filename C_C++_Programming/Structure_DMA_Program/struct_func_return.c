// #include <stdio.h>

// struct student
// {
//     char name[20];
//     int roll;
//     char gender;
//     int marks[5];
// };

// struct student increaseBy5(struct student p)
// {
//     for (int i = 0; i < 5; i++)
//         if (p.marks[i] + 5 <= 100)
//         {
//             p.marks[i] += 5;
//         }
//     return p;
// }

// int main()
// {
//     struct student stu1 = {"Alex", 43, 'M', {76, 98, 68, 87, 93}};
//     stu1 = increaseBy5(stu1);

//     printf("Name: %s\n", stu1.name);
//     printf("Roll: %d\n", stu1.roll);
//     printf("Gender: %c\n", stu1.gender);

//     for (int i = 0; i < 5; i++)
//         printf("Marks in %dth subject: %d\n", i, stu1.marks[i]);
//     return 0;
// }

#include <stdio.h>
#include <stdlib.h>

struct rectangle
{
    int length;
    int breadth;
};

struct rectangle *function(int length, int breadth)
{
    struct rectangle *p = (struct rectangle *)malloc(sizeof(struct rectangle));
    p->length = length;
    p->breadth = breadth;
    return p;
}

void main()
{
    struct rectangle *rectangle1 = function(5, 4);
    printf("Length of rectangle = %d units\n", rectangle1->length);
    printf("Breadth of rectangle = %d units\n", rectangle1->breadth);
    printf("Area of rectangle = %d square units\n", rectangle1->length * rectangle1->breadth);
}
