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

int search_list()
{
    int i;
    int n;
    int flag = 1;
    struct Node *fnnode;
    fnnode = stnode;
    printf("\n Enter the number that you want to search: ");
    scanf("%d", &n);

    for (i = 1; fnnode != NULL; i++)
    {
        if (fnnode->data == n)
        {
            return i;
        }
        fnnode = fnnode->next;
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
    int n, t1;
    printf("\n\n Linked List : Create a singly linked list:\n");
    printf("------------------------------------------------------------------------------\n");

    printf(" Input the number of nodes : ");
    scanf("%d", &n);
    createlist(n);
    printf("\n Display the linked list before search: \n");
    displaylist();
    t1 = search_list();
    printf("\nNumber found at the nodes in the list are: %d\n", t1);
    return 0;
}

// ===========================================================OR==============================================================================

// #include <stdio.h>
// #include <stdlib.h>

// struct node
// {
//     int num;
//     struct node *nextptr;
// }

// stnode,
//     *ennode;

// int FindElement(int);
// void main()
// {
//     int n, i, FindElem, FindPlc;
//     stnode.nextptr = NULL;
//     ennode = &stnode;
//     printf("\n\n Linked List : Search an element in a  Singly Linked List :\n");
//     printf("---------------------------------------------------------------\n");

//     printf(" Input the number of nodes : ");
//     scanf("%d", &n);
//     printf("\n");
//     for (i = 0; i < n; i++)
//     {
//         ennode->nextptr = (struct node *)malloc(sizeof(struct node));
//         printf(" Input data for node %d : ", i + 1);
//         scanf("%d", &ennode->num);
//         ennode = ennode->nextptr;
//     }
//     ennode->nextptr = NULL;
//     printf("\n Data entered in the list are :\n");

//     ennode = &stnode;
//     while (ennode->nextptr != NULL)
//     {
//         printf(" Data = %d\n", ennode->num);
//         ennode = ennode->nextptr;
//     }

//     printf("\n");
//     printf(" Input the element to be searched : ");
//     scanf("%d", &FindElem);
//     FindPlc = FindElement(FindElem);
//     if (FindPlc <= n)
//         printf(" Element found at node %d \n\n", FindPlc);
//     else
//         printf(" This element does not exists in linked list.\n\n");
// }
// int FindElement(int FindElem)
// {
//     int ctr = 1;
//     ennode = &stnode;
//     while (ennode->nextptr != NULL)
//     {
//         if (ennode->num == FindElem)
//             break;
//         else
//             ctr++;
//         ennode = ennode->nextptr;
//     }
//     return ctr;
// }
