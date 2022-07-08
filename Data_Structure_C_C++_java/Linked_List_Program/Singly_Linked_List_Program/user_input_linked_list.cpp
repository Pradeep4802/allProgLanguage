#include <iostream>
#include <cstdlib>
using namespace std;

struct Node
{
    int data;
    ;
    Node *next;
};

Node *Create_Node_In_Linked_list(Node *head)
{
    int data;
    cout << endl
         << "Enter the data of Linked List: \t";
    cin >> data;
    Node *p = (Node *)malloc(sizeof(Node));
    p->data = data;
    p->next = NULL;
    Node *ptr;

    if (head == NULL)
    {
        head = p;
        ptr = head;
        return head;
    }
    else
    {
        ptr->next = p;
        ptr = ptr->next;
        return head;
    }
}

void Print_Linked_list(Node *head)
{
    Node *p = head;
    int i = 1;
    while (p != NULL)
    {
        cout << " Element is " << i << " : \t " << p->data << "\n";
        p = p->next;
        i++;
    }
}
int main()
{
    Node *head;
    int n;
    cout << "Enter the number of nodes you wannt in Linked list: \t";
    cin >> n;
    head = NULL;
    for (int i = 0; i < n; i++)
    {
        head = Create_Node_In_Linked_list(head);
    }
    Print_Linked_list(head);
    return 0;
}