#include <stdio.h>

struct dist
{
    int feet;
    float inch;
} d1, d2 = {15, 2.5};

int main()
{
    d1.feet = 18;
    d1.inch = 7.3;

    printf("\n%d\'-%.2f\"\n", d1.feet, d1.inch);
    printf("\n%d\'-%.2f\"\n", d2.feet, d2.inch);

    return 0;
}