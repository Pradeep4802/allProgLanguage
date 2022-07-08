#include <iostream>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
using namespace std;

struct node
{
    int data;
    struct node *next;
};
void LinkedListTraversal(struct node *head)
{
    struct node *ptr = head;
    do
    {
        cout << "Element is " << ptr->data << endl;
        ptr = ptr->next;
    } while (ptr != head);
}

struct node *insertAtFirst(struct node *head, int data)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = data;

    struct node *p = head->next;
    while (p->next != head)
    {
        p = p->next;
    }
    // At this point p p oints  to the last node of this circular linked list
    p->next = ptr;
    ptr->next = head;
    head = ptr;
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
    second->data = 12;
    second->next = third;

    // create a third and fourth
    third->data = 13;
    third->next = fourth;

    // Terminating the linked list at the third node
    fourth->data = 14;
    fourth->next = head;

    cout << "Circular Linked List before insertion\n";
    LinkedListTraversal(head);
    head = insertAtFirst(head, 80);
    head = insertAtFirst(head, 536);
    cout << "Circular Linked List after insertion\n";
    LinkedListTraversal(head);
    return 0;
}