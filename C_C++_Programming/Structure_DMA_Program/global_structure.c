#include <stdio.h>

struct global
{
    int feet;
    float inches;
};

struct global f1;
int main()
{
    struct global f2;

    printf("\n Enter the first feet and inches: ");
    scanf("%d %f", &f1.feet, &f1.inches);

    printf("\n Enter the second feet and inches: ");
    scanf("%d %f", &f2.feet, &f2.inches);

    printf("\n %d\' - %f\"", f1.feet, f1.inches);
    printf("\n %d\' - %f\"", f2.feet, f2.inches);
    return 0;
}