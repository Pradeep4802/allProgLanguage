/*
Q.1 Write a program to create a single linked list and display the node elements in reverse order.
*/

#include <iostream>
#include <stdlib.h>
// #include <conio.h>
using namespace std;

class node
{
    int data;
    node *next;

public:
    void create();
    void display();
    void reverse();
};

node *temp = NULL, *ptr = NULL, *start = NULL, *ptt = NULL;

int t, count = 0;

void node::create()
{
    int y;
    if (start != NULL)
        cout << "\n\n\tLink list already created\n";
    else
    {
        do
        {
            temp = new node;
            temp->next = NULL;
            cout << "\nEnter a value : ";
            cin >> temp->data;

            if (start == NULL)
            {
                start = ptr = temp;
            }
            else
            {
                ptr->next = temp;
                ptr = temp;
            }
            cout << "Enter more node (1/0) : ";
            cin >> y;
        }while (y == 1);
    }
}
void node::display()
{
    if (start == NULL)
        cout << "\n\n\t\t There are no elements in the list\n\t\t Press enter to return to Main Menu";
    else
    {
        cout << "\n\nList Elements";
        cout << "\n--------------\n";
        temp = start;
        while (temp != NULL)
        {
            cout << "\n\t" << temp->data;
            temp = temp->next;
        }
    }
}

void node::reverse()
{
    ptr = start;
    temp = NULL;
    ptt = NULL;

    while (ptr != NULL)
    {
        temp = ptr->next;
        ptr->next = ptt;
        ptt = ptr;
        ptr = temp;
    }
    start = ptt;
    node n;
    n.display();
    // getch();
}

int main()
{
    int ch, y = 1;
    node n;
    while (1)
    {
        cout << "\n\n\n\t\t MAIN MENU\n";
        cout << "\n\t*****************************";
        cout << "\n\n\t 1. Create link list.\n";
        cout << "\n\t 2. Display the list.\n";
        cout << "\n\t 3. Reverse the list\n";
        cout << "\n\t 4. Exit.\n";
        cout << "\n\t*****************************\n";
        cout << "\n\n Enter your choice : ";
        cin >> ch;

        switch (ch)
        {
        case 1:
            n.create();
            break;

        case 2:
            n.display();
            // getch();
            break;

        case 3:
            n.reverse();
            break;

        case 4:
            exit(0);

        default:
            cout << "\n\n\n\t\t Invalid choice entered, \n press any key to return";
            break;
            // getch();
        }
    }
    return 0;
}