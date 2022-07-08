#include <stdio.h>

struct client
{
    int no;
    char name[10];
    char address[80];
    char city[80];
    char state[80];
    int pin[20];
} p[5];

int main()
{
    int i, n, n1;
    printf("Enter the client details: ");
    scanf("%d", &n);
    printf("\n**************************");
    for (i = 0; i < n; i++)
    {
        printf("\n\n\n Enter the client number:>>");
        scanf("%d", &p[i].no);
        printf("\n Enter the client Name:>> ");
        scanf("%s", p[i].name);
        printf("\n Enter the Address:>> ");
        scanf("%s", p[i].address);
        printf("\n Enter the city:>> ");
        scanf("%s", p[i].city);
        printf("\n Enter the state:>> ");
        scanf("%s", p[i].state);
        printf("\n Enter the pin number:>> ");
        scanf("%d", p[i].pin);
    }

    printf("\n\n\n Enter the Number:>> ");
    scanf("%d", &n1);

    for (i = 0; i < n; i++)
    {
        if (p[i].no == n1)
        {
            printf("No:>>%d Name:>>%s Address:>>%s\n", p[i].no, p[i].name, p[i].address);
        }
    }
    return 0;
}