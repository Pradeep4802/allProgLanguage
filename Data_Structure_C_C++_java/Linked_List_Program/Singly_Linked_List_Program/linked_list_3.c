#include "stdio.h"
#include "stdlib.h"

struct node
{
    int data;
    struct node *next;
};

void traverse_list(struct node *ptr)
{
    while (ptr != NULL)
    {
        printf("\n Data = %d", ptr->data);
        ptr = ptr->next;
    }
}
int main()
{
    struct node *head = (struct node *)malloc(sizeof(struct node));
    struct node *temp;
    struct node *newNode;
    int n;
    int y;
    int item;
    printf("\n Enter the no of element: ");
    scanf("%d", &n);

    printf("\n Enter the data: ");
    scanf("%d", &item);
    head->data = item;
    head->next = NULL;
    temp = head;
    for (int i = 2; i <= n; i++)
    {
        newNode = (struct node *)malloc(sizeof(struct node));

        if (newNode == NULL)
        {
            printf("\nOVERFLOW");
        }
        else
        {
            printf("\n Enter the data : ");
            scanf("%d", &item);

            newNode->data = item;
            newNode->next = NULL;

            temp->next = newNode;
            temp = temp->next;
        }
    }

    traverse_list(head);
    return 0;
}