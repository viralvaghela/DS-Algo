#include <stdio.h>
#include <malloc.h>

struct Node
{
    char data;
    struct Node *next;
    struct Node *prev;
};

void append(struct Node **head_ref, char newData)
{

    struct Node *newNode = (struct Node *)malloc(sizeof(struct Node));
    struct Node *last = *head_ref;

    newNode->data = newData;
    newNode->next = NULL;

    if (*head_ref == NULL)
    {
        newNode ->prev = NULL;
        *head_ref = newNode;
        return;
    }

    while (last->next != NULL)
    {
        last = last->next;
    }
    last->next = newNode;
    newNode->prev = last;
}

void printLinkForward(struct Node *node)
{
    printf("\nPrinting in Forward : \n");
    while (node != NULL)
    {
        printf("%c", node->data);
        node = node->next;
    }
}

void printReverse(struct Node **head_ref)
{
    struct Node *current = *head_ref;
    while (current->next != NULL)
    {
        current = current->next;
    }
    printf("\nPrinting in Reverse : \n");
    //go back to the first node
    while (current->prev != NULL)
    {
        printf("%c", current->data);
        current = current->prev;
    }
}

int main()
{

    struct Node *head = (struct Node *)malloc(sizeof(struct Node));

    append(&head, 'V');
    append(&head, 'i');
    append(&head, 'r');
    append(&head, 'a');
    append(&head, 'l');
    printLinkForward(head);
    printReverse(&head);

    return 0;
}
