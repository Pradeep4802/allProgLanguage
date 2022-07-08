#include "stdio.h"
#include "stdlib.h"

struct node
{
    int data;
    struct node *next;
};

struct node *head;

int main()
{
    int data;
    struct node *temp, *sec;

    head = (struct node *)malloc(sizeof(struct node));
    sec = (struct node *)malloc(sizeof(struct node));
    if (head == NULL)
    {
        printf("Unable to allocate memory.");
        exit(0);
    }
    printf("Enter the data of node : \n");
    scanf("%d", &data);
    head->data = data;
    head->next = NULL;
    // head->next = NULL;
    // printf("Enter the data of node 2: \n");
    // scanf("%d",&data);
    // sec->data = data;
    // sec->next = NULL;
    temp = head;
    printf("\nRes = %d", temp->data);
    temp = temp->next;
    printf("\nRes = %d", temp->data);
    temp = temp->next;
    printf("\nRes = %d", temp->data);
    return 0;
}