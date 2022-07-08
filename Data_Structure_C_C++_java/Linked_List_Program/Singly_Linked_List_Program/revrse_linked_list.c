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

void reverselist()
{
    struct Node *prevNode, *curNode;

    if (stnode != NULL)
    {
        prevNode = stnode;
        curNode = stnode->next;
        stnode = stnode->next;

        prevNode->next = NULL; //convert the first node as last

        while (stnode != NULL)
        {
            stnode = stnode->next;
            curNode->next = prevNode;

            prevNode = curNode;
            curNode = stnode;
        }
        stnode = prevNode; //convert the last node as head
    }
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
    int n;
    printf("\n\n Linked List : Create a singly linked list and print it in reverse order :\n");
    printf("------------------------------------------------------------------------------\n");

    printf(" Input the number of nodes : ");
    scanf("%d", &n);
    createlist(n);
    printf("\n Display the linked list before reverse: \n");
    displaylist();
    reverselist();
    printf("\nThe reverse list are: \n");
    displaylist();
    return 0;
}