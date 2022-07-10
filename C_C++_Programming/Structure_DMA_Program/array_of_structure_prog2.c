#include <stdio.h>

struct account
{
    int no;
    float bal;
};

int main()
{
    struct account a1[3];
    int i, j;
    int acc;
    float balance;

    for (i = 0; i < 3; i++)
    {
        printf("\n Enter the account no and Balance : ");
        scanf("%d %f", &acc, &balance);

        a1[i].no = acc;
        a1[i].bal = balance;
    }
    for (i = 0; i < 3; i++)
    {
        printf("Account Number = %d, Account Balance = %.2f\n", a1[i].no, a1[i].bal);
    }

    return 0;
}