#include <iostream>
// #include <cstdlib>
using namespace std;

struct node
{
    int data;
    node *prev;
    node *next;
};

node *head, *newNode;
void create_DLL()
{
    head = NULL;
    node *temp;
    int choice = 1;
    while (choice)
    {
        newNode = (node *)malloc(sizeof(node));
        cout << "Enter the data: ";
        cin >> newNode->data;

        newNode->prev = NULL;
        newNode->next = NULL;
        if (head == NULL)
        {
            head = temp = newNode;
        }
        else
        {
            temp->next = newNode;
            newNode->prev = temp;
            temp = newNode;
        }
        cout << "\n Do you want to continue: ";
        cin >> choice;
    }
}

void display() {
    node *temp;
    temp = head;
    cout << "\n Displaying the node in the list: ";
    while (temp != 0)
    {
        cout << temp -> data << "\t";
        temp = temp->next;
    }
}
int main()
{
    create_DLL();
    display();
    return 0;
}