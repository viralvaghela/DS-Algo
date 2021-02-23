#include <stdio.h>
#include <malloc.h>

struct Node
{
    int data;
    struct Node *next;
};

void push(struct Node **headRef, int newData)
{

    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    newNode->data = newData;

    if (*headRef == NULL)

    {
        (*headRef) = newNode;
        newNode->next = NULL;
        return;
    }

    newNode->next = (*headRef);
    (*headRef) = newNode;
}

void printList(struct Node *h)
{
    printf("\nprinting:");

    while (h != NULL)
    {
        printf("%d => ", h->data);
        h = h->next;
    }
}

int main()
{
    //theek h bye

    struct Node *head = NULL;
    push(&head, 30);
    push(&head, 20);
    push(&head, 10);
    printList(head);

    return 0;
}