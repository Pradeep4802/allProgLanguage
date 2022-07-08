#include <iostream>
using namespace std;

struct node
{
    int data;
    struct node *next;
} * head, *tail;

void createCLL()
{
    int choice = 1;
    struct node *newnode;
    head = 0;
    while (choice)
    {
        newnode = (node *)malloc(sizeof(node));
        printf("Enter data: ");
        scanf("%d", &newnode->data);
        newnode->next = 0;
        if (head == 0)
        {
            head = tail = newnode;
            tail->next = head;
        }
        else
        {
            tail->next = newnode;
            tail = newnode;
            tail->next = head;
        }
        tail->next = head;
    }
    tail->next->data;
}

void displayClList()
{
    struct node *tmp;
    int n = 1;

    tmp = head;

    do
    {
        printf(" Data %d = %d\n", n, tmp->data);
        tmp = tmp->next;
        n++;
    } while (tmp != head);
}
int main()
{
    cout << "\n Create a circular linked list: ";
    createCLL();
    displayClList();
    return 0;
}