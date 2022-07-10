#include <stdio.h>

struct account
{
    int no;
    char acc_name[15];
    float bal;
};
int main()
{
    // struct account a1;
    // printf("\n Enter the account Numbers, Names, and balances: \n");
    // scanf("%d %s %f", &a1.no, a1.acc_name, &a1.bal);

    // printf("Account Numbers: %d, Account Name: %s, Account Balance: %.2f", a1.no, a1.acc_name, a1.bal);

    struct account a1 = {123,"Pradeepkumar",34353}, a2 = {345,"Nikhil",343433};
    printf("%d \t %s \t %f\n",a1.no,a1.acc_name,a1.bal);
    printf("%d \t %s \t %f",a2.no,a2.acc_name,a2.bal);
    return 0;
}