#include <iostream>
#include <cstdlib>

struct node
{
    int info;
    node *link;
};

node *start = NULL;

node *createNode()
{
    node *n;
    n = (node *)malloc(sizeof(struct node));
    return (n);
}

node *insertNode()
{
    node *temp, *t;
    int n;
    std::cout << "\n Enter the number of the element: ";
    std::cin >> n;
    int i = 0;
    while (i < n)
    {
        temp = createNode();
        i++;
        std::cout << "Enter a number: ";
        std::cin >> temp->info;
        temp->link = NULL;
        if (start == NULL)
        {
            start = temp;
        }
        else
        {
            t = start;
            while (t->link != NULL)
            {
                t = t->link;
            }
            t->link = temp;
        }
    }
    return start;
}

void Print_Linked_list(node *head)
{
    node *p = head;
    int i = 1;
    while (p != NULL)
    {
        std::cout << " Element is " << i << " : \t " << p->info << "\n";
        p = p->link;
        i++;
    }
}

int main()
{
    node *head;
    head = insertNode();
    Print_Linked_list(head);
    return 0;
}