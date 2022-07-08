#include <iostream>
using namespace std;

struct Node
{
    int data;
    Node *next;
} * stnode;

void createList(int n)
{
    Node *temp, *fnode;
    int item;
    stnode = (Node *)malloc(sizeof(Node));

    if (stnode == NULL)
    {
        cout << "\n Memory Overloaded.";
        exit(0);
    }
    else
    {
        cout << "\n Input :#1";
        cin >> item;
        stnode->data = item;
        stnode->next = NULL;
        temp = stnode;

        for (int i = 2; i < n; i++)
        {
            fnode = (Node *)malloc(sizeof(Node));

            if (fnode == NULL)
            {
                cout << "\n Memory overloaded.";
                exit(0);
            }
            else
            {
                cout << "\n Input data " << i << ":";
                cin >> item;
                fnode->data = item;
                fnode->next = NULL;

                temp->next = fnode;
                temp = temp->next;
            }
        }
    }
}

void displaylist()
{
    struct Node *temp;
    if (stnode == NULL)
    {
        printf("\n No data found in the node...");
        exit(0);
    }
    else
    {
        temp = stnode;
        while (temp != NULL)
        {
            printf("\n Data : %d", temp->data);
            temp = temp->next;
        }
    }
}

void count()
{
    
}
int main()
{
    int n;
    cout << "\n Enter the No of node: ";
    cin >> n;
    createList(n);
    printf("\n Display the linked list before reverse: \n");
    displaylist();
    return 0;
}