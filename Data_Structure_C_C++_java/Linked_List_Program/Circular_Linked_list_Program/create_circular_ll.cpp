#include <iostream>
#include <stdio.h>
#include <stdlib.h>
using namespace std;

struct node
{
    int data;
    node *next;
} * head;

void createCircularLL(int n);
void displayCircularLL();

int main()
{
    int n;
    head = NULL;
    cout << "\n\n Circular Linked List : Create and display a circular linked list :\n";
    cout << "------------------------------------------------------------------------";

    cout << "\n Enter the no. nodes in the list: ";
    cin >> n;
    createCircularLL(n);
    displayCircularLL();
    return 0;
}

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
        newnode = (node *)malloc(sizeof(node));
        for (int i = 2; i <= n; i++)
        {
            cout << "Input the node " << i << ":";
            cin >> num;
            newnode->data = num;
            newnode->next = NULL;
            preptr->next = newnode;
            preptr = newnode;
        }
        preptr->next = head;
    }
}

void displayCircularLL()
{
    node *temp;
    int n = 1;
    if (head == NULL)
    {
        cout << "No data was found in the list.";
    }
    else
    {
        temp = head;
        do
        {   
            cout << "Data " << n << " = " << temp->data << endl;
            temp = temp->next;
            n++;
        } while (temp != head);
    }
}