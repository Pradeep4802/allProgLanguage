// Write a c++ program of deletion from linked list

#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

void LinkedListTraversal(struct node *ptr)
{
    while (ptr != NULL)
    {
        printf("\n Element : %d", ptr->data);
        ptr = ptr->next;
    }
}

// case 1: Deleting the first element from the list
struct node *Linked_list_deletion(struct node *ptr)
{
    struct node *ptr1 = ptr;
    ptr = ptr->next;
    free(ptr1);
    return ptr;
}

// case 2: Deleting the element at a given index from the linked list
struct node *delete_At_Index(struct node *head, int ind)
{
    struct node *ptr = head;
    struct node *q = head->next;
    int i = 0;
    while (i < ind - 1)
    {
        ptr = ptr->next;
        q = q->next;
        i++;
    }
    // struct node *q = ptr->next;
    ptr->next = q->next;
    free(q);
    return head;
}

// case 3: Deleting the last element
struct node *delete_last_node(struct node *head)
{
    struct node *p = head;
    struct node *q = head->next;

    while (q->next != NULL)
    {
        p = p->next;
        q = q->next;
    }
    p->next = NULL;
    free(q);
    return head;
}

// case 4: Deleting the value of the at the node
struct node *delete_value(struct node *head, int value)
{
    struct node *ptr = head;
    struct node *q = head->next;

    while (q->data != value && q->next != NULL)
    {
        ptr = ptr->next;
        q = q->next;
    }
    if (q->data == value)
    {
        ptr->next = q->next;
        free(q);
    }
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

    printf("Linked list after deletion\n");
    LinkedListTraversal(head);

    // head = Linked_list_deletion(head);  // For deleting first element of the linked list
    // head = delete_At_Index(head, 2);  // For deleting the element at the given index
    // head = delete_last_node(head); // For deleting the element at the last node
    head = delete_value(head, 21);
    printf("\n Linked list after deletion");
    LinkedListTraversal(head);
    return 0;
}