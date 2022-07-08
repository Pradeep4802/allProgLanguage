// Write a program in C to insert a node at the end of a circular linked list.

#include <iostream>
#include <cstdlib>
using namespace std;

struct node
{
    int data;
    struct node *next;
} * head;

void createCircularLL(int n)
{
    int num;
    node *preptr, *newnode;

    if (n >= 1)
    {
        head = (node *)malloc(sizeof(node));

        cout << "\n Input the node 1: ";
        cin >> num;
        head->data = num;
        head->next = NULL;
        preptr = head;
        for (int i = 2; i <= n; i++)
        {
            newnode = (node *)malloc(sizeof(node));
            cout << "Input the node " << i << ":";
            cin >> num;
            newnode->data = num;
            newnode->next = NULL;   // next address of new node set as NULL
            preptr->next = newnode; // previous node is linking with new node
            preptr = newnode;       // previous node is advanced
        }
        preptr->next = head; // last node is linking with first node00
    }
}

void insert_node_end(int val)
{
    node *ptr = (node *)malloc(sizeof(node));
    ptr->data = val;
    node *p = head;
    while (p->next != head)
    {
        p = p->next;
    }
    p->next = ptr;
    ptr->next = head;
}
void displayClList(int m)
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
    int n, num1, a;
    head = NULL;
    printf("\n\n Circular Linked List : Insert a node at the end of a circular linked list :\n");
    printf("--------------------------------------------------------------------------------------\n");
    printf(" Input the number of nodes : ");
    scanf("%d", &n);
    createCircularLL(n);
    a = 1;
    displayClList(a);
    printf(" Input data to be inserted at the end : ");
    scanf("%d", &num1);
    insert_node_end(num1);
    a = 2;
    displayClList(a);
    return 0;
}