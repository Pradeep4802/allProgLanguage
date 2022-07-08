#include <stdio.h>
#include <stdlib.h>
void create(int);
void traverse(void);

struct node
{
    int data;
    struct node *next;
};

struct node *head;

int main()
{
    int choice, item;

    do
    {
        printf("\n1.Append List\n2. Traverse List\n3. Exit\n4. Enter your choice? ");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            printf("\n Enter the Items: \n");
            scanf("%d", &item);
            create(item);
            break;

        case 2:
            traverse();
            break;

        case 3:
            exit(0);
            break;
        default:
            printf("\n Please enter the valid choice\n");
            break;
        }
    } while (choice != 3);
}

void create(int item)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));

    if (ptr == NULL)
    {
        printf("\nOVERFLOW\n");
    }
    else
    {
        ptr->data = item;
        ptr->next = head;
        head = ptr;
        printf("\nNode inserted\n");
    }
}

void traverse()
{
    struct node *ptr;
    // ptr = head;

    if (ptr == NULL)
    {
        printf("Empty list...");
    }
    ptr = head;
    printf("Printing values ...... \n");
    while (ptr != NULL)
    {
        printf("\n%d", ptr->data);
        ptr = ptr->next;
    }
}