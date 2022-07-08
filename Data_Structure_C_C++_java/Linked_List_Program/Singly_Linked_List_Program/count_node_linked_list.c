#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
} * stnode;

void createlist(int);
void reverselist();
void displaylist();

void createlist(int n)
{
    struct Node *fnode, *tmp;
    int item;
    stnode = (struct Node *)malloc(sizeof(struct Node));

    if (stnode == NULL)
    {
        printf("Memory Overflow!!!!\n");
        exit(0);
    }
    else
    {
        printf("\n Input data 1: ");
        scanf("%d", &item);
        stnode->data = item;
        stnode->next = NULL;
        tmp = stnode;

        for (int i = 2; i <= n; i++)
        {
            fnode = (struct Node *)malloc(sizeof(struct Node));
            if (fnode == NULL)
            {
                printf("\n OVERFLOW!!!!");
                exit(0);
            }
            else
            {
                printf("\n Input data %d: ", i);
                scanf("%d", &item);
                fnode->data = item;
                fnode->next = NULL;

                tmp->next = fnode;
                tmp = tmp->next;
            }
        }
    }
}

int countlist()
{
    int n = 0;
    struct Node *fnnode;
    fnnode = stnode;

    while (fnnode != NULL)
    {
        n++;
        fnnode = fnnode->next;
    }
    return n;
}

void displaylist()
{
    struct Node *temp;
    if (stnode == NULL)
    {
        printf("\n No data found in the node...");
        exit(0);
    }
    else
    {
        temp = stnode;
        while (temp != NULL)
        {
            printf("\n Data : %d", temp->data);
            temp = temp->next;
        }
    }
}

int main()
{
    int n,t1;
    printf("\n\n Linked List : Create a singly linked list and print it in reverse order :\n");
    printf("------------------------------------------------------------------------------\n");

    printf(" Input the number of nodes : ");
    scanf("%d", &n);
    createlist(n);
    printf("\n Display the linked list before : \n");
    displaylist();
    t1 = countlist();
    printf("\nNumber of Nodes in the list are: %d\n", t1);
    return 0;
}