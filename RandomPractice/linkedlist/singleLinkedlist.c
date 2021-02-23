/*
Code : single linkedlist insert at the end,between, and at the end(append),delete using key self learning
Author : Viral 
Date : 17-Jan-2021
*/

#include <stdio.h>
#include <malloc.h>
struct Node
{
    int data;
    struct Node *next;
};

/******************  INSERTION ********************/
void push(struct Node **head, int newData)
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->data = newData;
    newNode->next = (*head);
    *head = newNode;
}

void append(struct Node **head, int newData)
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->data = newData;
    newNode->next = NULL;
    struct Node *last = *head;

    if (*head == NULL)
    {
        *head = newNode;
        return;
    }

    while (last->next != NULL)
    {
        last = last->next;
    }
    last->next = newNode;
    return;
}

void insertAfter(struct Node *prevNode, int newData)
{
    if (prevNode == NULL)
    {
        printf("It should not be  NULL");
        return;
    }

    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->data = newData;

    newNode->next = prevNode->next;
    prevNode->next = newNode;
    return;
}

/******************  DELETION ********************/

void deleteNode(struct Node **headRef, int key)
{
    struct Node *temp = *headRef, *prev;

    if (temp != NULL && temp->data == key)
    {
        *headRef = temp->next;
        free(temp);
        return;
    }

    while (temp->data != key && temp != NULL)
    {
        prev = temp;
        temp = temp->next;
    }

    if (temp == NULL)
        return;

    prev->next = temp->next;
    free(temp);
}

/******************  PRINT ********************/
void printList(struct Node *node)
{
    printf("\nPrinting List:\n");
    while (node != NULL)
    {
        printf("%d -> ", node->data);
        node = node->next;
    }
}

int main()
{
    struct Node *head = NULL;

    push(&head, 10);
    push(&head, 20);
    push(&head, 30);
    append(&head, 5);
    insertAfter(head->next, 15);
    printList(head);
    deleteNode(&head, 20);
    printList(head);
    return 0;
}