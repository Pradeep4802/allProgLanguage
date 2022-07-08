// Write a program in C to delete node from the beginning of a circular linked list

#include <iostream>
#include <cstdlib>
using namespace std;

struct node
{
    int data;
    struct node *next;
} * head;

node *p;
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

void delete_node_beg()
{
    node *ptr = head;
    while (ptr->next != head)
    {
        ptr = ptr->next;
    }
    p = head;
    head = head->next;
    cout << "\n The deleted node is -> " << p->data <<  endl;
    ptr->next = head;
    // free(p);
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
    delete_node_beg();
    a = 2;
    cout << "After deletion of the node is : " << endl;
    displayClList(a);
    return 0;
}