// Write a program in C to delete node from the middle of a circular linked list

#include <iostream>
#include <cstdlib>
using namespace std;

struct node
{
    int data;
    struct node *next;
} * head;

node *p, *tmp, *ptr;

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

// void delete_node_mid(int pos)
// {
//     int delcount, k = 1;
//     delcount = pos;
//     p = head;

//     while (k != delcount)
//     {
        
//     }
//     tmp->next = p->next;
//     printf("\n The deleted node is : %d", p->data);
//     free(p);
// }
// void delete_node_mid(int pos)
// {
//     int delcount, k = 1;
//     delcount = pos;
//     p = head;

//     while (k != delcount)
//     {
//         tmp = p;
//         p = p->next;
//         k++;
//     }
//     tmp->next = p->next;
//     printf("\n The deleted node is : %d", p->data);
//     free(p);
// }
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
    int n, num1, a, pos;
    head = NULL;
    printf("\n\n Circular Linked List : Delete a node at the middle of a circular linked list :\n");
    printf("--------------------------------------------------------------------------------------\n");
    printf(" Input the number of nodes : ");
    scanf("%d", &n);
    createCircularLL(n);
    a = 1;
    displayClList(a);
    printf("\n Input the position to delete the node : ");
    scanf("%d", &pos);
    delete_node_mid(pos);
    a = 2;
    cout << "After deletion of the node is : " << endl;
    displayClList(a);
    return 0;
}