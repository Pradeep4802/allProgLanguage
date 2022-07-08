#include "stdio.h"
#include "stdlib.h"

struct node
{
    int data;
    struct node *next;
};

void linkedListTraverse(struct node *ptr)
{
    while (ptr != NULL)
    {
        printf("Element: %d\n", ptr->data);
        ptr = ptr->next;
    }
}

struct node *insertAtFirst(struct node *head, int data)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->next = head;
    ptr->data = data;
    return ptr;
}

struct node *insertAtIndex(struct node *head, int data, int index)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    struct node *p = head;

    int i = 0;
    while (i != index - 1)
    {
        p = p->next;
        i++;
    }

    ptr->data = data;
    ptr->next = p->next;
    p->next = ptr;
    return head;
}

struct node *insertAtEnd(struct node *head, int data)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    struct node *p = head;
    ptr->data = data;

    while (p->next != NULL)
    {
        p = p->next;
    }

    p->next = ptr;
    ptr->next = NULL;
    return head;
}

struct node *insertAfterNode(struct node *head, struct node *prevNode, int data)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = data;

    ptr->next = prevNode->next;
    prevNode->next = ptr;
    return head;
}

int main()
{
    struct node *head;
    struct node *second;
    struct node *third;
    struct node *fourth;

    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));
    fourth = (struct node *)malloc(sizeof(struct node));

    // create a first and second node
    head->data = 11;
    head->next = second;

    // create a second and third node
    second->data = 21;
    second->next = third;

    // create a third and fourth
    third->data = 31;
    third->next = fourth;

    // Terminating the linked list at the third node
    fourth->data = 41;
    fourth->next = NULL;

    printf("\n Linked List Before Insertion\n");
    linkedListTraverse(head);
    // head = insertAtFirst(head, 56);
    printf("\n Linked List After Insertion\n");
    // head = insertAtIndex(head, 56, 2);
    // head = insertAtEnd(head, 56);
    head = insertAfterNode(head, third, 51);
    linkedListTraverse(head);
    return 0;
}