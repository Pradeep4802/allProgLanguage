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

node *deleteNode()
{
    struct node *r;
    r = start;
    if (start == NULL)
    {
        std::cout << "List is empty";
    }
    else
    {
        start = start->link;
        free(r);
    }
    return start;
}

void viewList()
{
    node *t;
    t = start;
    if (start == NULL)
    {
        std::cout << "List is empty";
    }
    else
    {
        int i = 1;
        while (t != NULL)
        {
            std::cout << " Element is " << i << " : \t " << t->info << "\n";
            t = t->link;
            i++;
        }
    }
}

// void Print_Linked_list(node * head)
// {
//     node *p = head;
//     int i = 1;
//     while (p != NULL)
//     {
//         std::cout << " Element is " << i << " : \t " << p->info << "\n";
//         p = p->link;
//         i++;
//     }
// }

int menu()
{
    int ch;
    std::cout << std::endl
              << "1. Add value to the list";
    std::cout << std::endl
              << "2. Delete the value";
    std::cout << std::endl
              << "3. View the List";
    std::cout << std::endl
              << "4. Exit";
    std::cout << std::endl
              << "Enter your choice";
    std::cin >> ch;
    return ch;
}

int main()
{
    while (1)
    {
        switch (menu())
        {
        case 1:
            insertNode();
            break;
        case 2:
            deleteNode();
            break;
        case 3:
            viewList();
            break;
        case 4:
            exit(0);
        default:
            std::cout << "Invalid Choice";
        }
    }

    // node *head, *del;
    // head = insertNode();
    // std::cout << "\n Element before the the list is deleting:\n";
    // viewList();
    // del = deleteNode();
    // std::cout << "\n Element after the the list is deleting:\n";
    // viewList();
    return 0;
}