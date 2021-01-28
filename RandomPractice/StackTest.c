#include <stdio.h>
#define MAX 5
int TOP;
int stack[MAX];

void push(int n)
{
    if (TOP > MAX)
    {
        printf("\nCant push,Stack is FULL");
        return;
    }
    else
    {
        TOP++;
        stack[TOP] = n;
    }
}
void pop()
{
    if (TOP == -1)
    {
        printf("\nCant pop ,Stack is Empty");
        return;
    }
    else
    {

        printf("\nPOP : %d", stack[TOP]);

        TOP--;
    }
}
void printStack()
{
    if (TOP < 0)
    {
        printf("\nCant print,Stack is Empty");
    }
    else
    {
        printf("\nPrinting stack: ");
        for (int i = 0; i <= TOP; i++)
        {
            printf("%d ", stack[i]);
        }
    }
}
int main()
{
    TOP = -1;
    push(10);
    push(20);
    printStack();
    pop();
    printStack();

    // pop();
    return 0;
}