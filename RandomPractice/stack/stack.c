#include<stdio.h>
#define MAXSIZE 2
int TOP=-1;
int stack[MAXSIZE];

void push(int value)
{
    if(TOP==(MAXSIZE-1))
    {
        printf("Stack Overflow");
        return;
    }
    else {
        TOP=TOP+1;
        stack[TOP]=value;
       printf("Inserted : %d\n",value);
    }
}

void display()
{

    for(int i =TOP;i>=0;i--)
    {
        printf("\n| %d |",stack[i]);
    }
}

void main()
{
    push(5);
    push(15);
    push(25);
    push(35);
    push(45);
    display();

}