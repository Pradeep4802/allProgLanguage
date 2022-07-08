#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
} * head;

int largest_element(struct node *ptr)
{
    ptr = (struct node *)malloc(sizeof(struct node));
    int max;
    max = head->data;
    ptr = head->next;

    while (ptr != NULL)
    {
        if (ptr->data > max)
        {
            max = ptr->data;
        }
        ptr = ptr->next;
    }
    return max;
}
int main()
{
    struct node *temp, *newNode;
    int n;
    int item;
    int largest;
    head = (struct node *)malloc(sizeof(struct node));

    printf("\n Enter the no of of element: ");
    scanf("%d", &n);
    if (head == NULL)
    {
        printf("\n Memory overflow");
    }
    else
    {

        printf("\n Enter the data in the element #1: ");
        scanf("%d", &item);

        head->data = item;
        head->next = NULL;

        temp = head;

        for (int i = 2; i <= n; i++)
        {
            newNode = (struct node *)malloc(sizeof(struct node));

            printf("\n Enter the data in the node #%d:", i);
            scanf("%d", &item);

            newNode->data = item;
            newNode->next = NULL;

            temp->next = newNode;
            temp = temp->next;
        }
    }

    largest = largest_element(head);
    printf("\n Largest Element are %d", largest);
    return 0;
}
