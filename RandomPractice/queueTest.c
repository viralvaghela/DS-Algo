#include <stdio.h>
#define MAX 10
int queue[MAX];
int front, rear;

void enqueue(int n)
{
    if (rear == -1)
    {
        front = rear = 0;
        queue[rear] = n;
    }
    else if (rear == MAX - 1)
    {
        printf("\n QUEUE is full,cant insert");
        return;
    }
    else
    {
        rear++;
        queue[rear] = n;
    }
}

void dequeue()
{
    if (front == -1)
    {
        printf("\n Queue is Empty");
        return;
    }
    else if (front == rear)
    {
        printf("\nDEQUEUE: %d", queue[front]);
        front = rear = -1;
    }
    else
    {
        printf("\n Dequeue %d", queue[front]);
        front++;
    }
}

void printQueue()
{
    if (rear == -1)
    {
        printf("\n Queue is empty");
    }
    else
    {
        printf("\n Printing Queue: ");
        for (int i = front; i <= rear; i++)
        {
            printf("%d", queue[i]);
        }
    }
}
int main()
{
    front = rear = -1;
    enqueue(10);
    enqueue(20);
    enqueue(30);
    printQueue();

    dequeue();
    dequeue();
    printQueue();

    return 1;
}