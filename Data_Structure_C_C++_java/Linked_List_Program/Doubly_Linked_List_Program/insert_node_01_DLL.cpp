#include<iostream>
#include<cstdlib>
using namespace std;

struct node {
    node *prev;
    int data;
    node *next;
};

node * addToEmpty(node* head, int data) {
    node* temp = (node*)malloc(sizeof(node));
    temp -> prev = NULL;
    temp -> data = data;
    temp->next = NULL;
    head = temp;
    return head;
}
int main() {
    node *head = NULL;
    head = addToEmpty(head, 45);
    cout << head->data;
    return 0;
}