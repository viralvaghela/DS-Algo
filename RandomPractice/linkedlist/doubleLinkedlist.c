/*
Code : Double linkedlist insert at the end,between, and at the end(append),delete using key self learning
Author : Viral 
Date : 17-Jan-2021
*/

#include <stdio.h>
#include <malloc.h>
struct Node
{
    int data;
    struct Node *next;
    struct Node *prev;
};

void push(struct Node **headRef, int newData)
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->data = newData;
    //check if head is NULL
    if (*headRef == NULL)
    {
        newNode->next = NULL;
        newNode->prev = NULL;
        (*headRef) = newNode;
        return;
    }

    newNode->prev = NULL;
    newNode->next = (*headRef);
    (*headRef) = newNode;
}

void insertAfter(struct Node *preNode, int newData)
{
    if (preNode == NULL)
    {
        printf("Cant be NULL");
        return;
    }

    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->data = newData;

    newNode->next = preNode->next;
    newNode->next->prev = newNode;
    preNode->next = newNode;
    newNode->prev = preNode;

    return;
}

void insertAtTheEnd(struct Node **headRef, int newData)
{
    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    struct Node *last = (*headRef);

    newNode->data = newData;
    newNode->next = NULL;

    if (*headRef == NULL)
    {
        (*headRef)->prev = NULL;
        (*headRef) = newNode;
        return;
    }

    while (last->next != NULL)
    {
        last = last->next;
    }

    last->next = newNode;
    newNode->prev = last;
    return;
}

void printList(struct Node *node)
{
    printf("\nPrinting List:\n");
    while (node != NULL)
    {
        printf("%d -> ", node->data);
        node = node->next;
    }
}

void main()
{
    struct Node *head = NULL;
    push(&head, 30);
    insertAtTheEnd(&head, 0);
    push(&head, 20);
    push(&head, 10);

    insertAfter(head->next, 5);
    insertAtTheEnd(&head, 99);

    printList(head);
}