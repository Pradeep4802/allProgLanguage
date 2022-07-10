#include <stdio.h>
#include <stdlib.h>

int main()
{
    // Dynamic memory allocation
    // ABC Pvt Ltd. manages employee records at other companies
    // Employee ID can be of any length of employee id' as input in a length integer variable.
    // For 3 employee, you have to take 'length of employess id' as input in a length variable.
    // Then, you have to take employee id as an input and display it on screen.
    // Store the employee id in a character array which is allocacted dynamically.
    // You have to create only one character array dynamically.

    // employee 1:
    // Enter no of character in your eID
    // 45
    // dynamically allocate
    // take input from user

    // employee 2:
    // Enter no of character in your eID
    // 45
    // dynamically allocate
    // take input from user

    // employee 3:
    // Enter no of character in your eID
    // 45
    // dynamically allocate
    // take input from user

    char *emp;
    char a, b;
    int chars, n;

    for (int i = 0; i < 3; i++)
    {
        printf("\n Enter the number of the length: ");
        scanf("%d", &chars);

        getchar();   
        printf("\n Enter the value of a\n");
        scanf("%c", &a);

        getchar();
        printf("\n Enter the value of b\n");
        scanf("%c", &b);

        emp = (char *)malloc((chars+1)*sizeof(char));

        printf("\n Enter the character from user for Employee #%d: ", i);
        scanf("%s", emp);
        printf("\n\t\t Employee#%d : %s", i, emp);
        free(emp);
    }

    return 0;
}
