#include <stdio.h>

struct product
{
    int code;
    char prod_name[10];
    int qty;
} it[10];

int main()
{
    int n;
    int i;
    int flag = 0;
    int icode;

    printf("\n How many product: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++)
    {
        printf("\n Product#%d: Code Product Name Quantity: ", i);
        scanf("%d %s %d", &it[i].code, it[i].prod_name, &it[i].qty);
    }

    printf("\n Enter the item code that you want to view: ");
    scanf("%d", &icode);

    for (i = 0; i < n; i++)
    {
        if (it[i].code == icode)
        {
            flag = 1;
            printf("\n Product name = %s\n Quantity = %d", it[i].prod_name, it[i].qty);
            break;
        }
    }

    if (flag == 0)
    {
        printf("\n NOT FOUND!!!");
    }

    return 0;
}