#include<iostream>
#include<stdlib.h>
using namespace std;

struct node {
    int data;
    node *prev;
    node *next;
};

void traverse_DLL(node *ptr)
{
    node *temp;
    while (ptr != NULL)
    {
        cout << "The data is : " << ptr->data << endl;
        temp = ptr;
        ptr = ptr->next;
    }    
    // ptr = temp;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    // node *tmp = ;
    // tmp = tmp->prev;
    cout << "Reverse the list: "<< endl;
    while (temp != NULL)
    {
        cout << "The data is : " << temp->data << endl;
        temp = temp -> prev;
    }
    
}
int main()
{
    struct node *n1;    
    struct node *n2;    
    struct node *n3;    
    struct node *n4;

    n1 = (node *)malloc(sizeof(node));
    n2 = (node *)malloc(sizeof(node));
    n3 = (node *)malloc(sizeof(node));
    n4 = (node *)malloc(sizeof(node));

    n1->data = 45;
    n1->next = n2; 
    n1->prev = NULL;

    n2->data = 55;
    n2->next = n3; 
    n2->prev = n1;

    n3->data = 33;
    n3->next = n4; 
    n3->prev = n2;

    n4->data = 90;
    n4->next = NULL; 
    n4->prev = n3;

    traverse_DLL(n1);
    return 0;  
}