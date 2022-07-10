#include <stdio.h>

struct item
{
    int code;
    char p_name[10];
    int qty;
};

int main()
{
    struct item it[10], t;
    int i, j;
    int n;

    printf("\n Enter How many product that user want : ");
    scanf("%d", &n);

    for (i = 0; i < n; i++)
    {
        printf("\n Product#%d: Code Product_name quantity: ", i+1);
        scanf("%d%s%d", &it[i].code, it[i].p_name, &it[i].qty);
    }

    for (i = 0; i < n - 1; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (it[i].code > it[j].code)
            {
                t = it[i];
                it[i] = it[j];
                it[j] = t;
            }
        }
    }

    printf("After sorting on code\n");
    for (i = 0; i < n; i++)
    {
        printf("\n Item code: %d\tItem Name: %s\tItem Quantity: %d\n", it[i].code, it[i].p_name, it[i].qty);
    }
    return 0;
}