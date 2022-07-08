#include<iostream>
#include<stdlib.h>
using namespace std;

struct node {
    int data;
    struct node *next;
};

struct node *addToEmpty(int data) {
    struct node *temp = (node *)malloc(sizeof(struct node));
    temp->data = data;
    temp->next = temp;
    return temp;
}

struct node *addAtBeg(struct node *tail, int data) {
    node *newP = (node *)malloc(sizeof(struct node));
    newP->data = data;
    newP->next = tail->next;
    tail->next = newP;
    return tail;
}

void print(struct node *tail) {
    struct node *p = tail->next;
    do
    {
        cout << " " << p->data;
        p = p->next;
    } while (p!=tail->next);
}
int main()
{
    struct node *tail;
    tail = addToEmpty(45);
    tail = addToEmpty(564);
    tail = addToEmpty(987);
    tail = addAtBeg(tail, 34);
    tail = addAtBeg(tail, 565);
    tail = addAtBeg(tail, 9685);
    print(tail);
    return 0;  
}