#include <stdio.h>

/********  Bubble Sort *********/
void printArray(int ar[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", ar[i]);
    }
}

void linearSearch(int ar[],int n,int value)
{
    for(int i=0;i<n;i++)
    {
        if(ar[i]==value)
        {
            printf("Value : %d found at Position %d",value,i);
        }
    }
}
void main()
{
    int ar[] = {5, 1, 2, 4, 3, 7};
    int n = sizeof(ar) / sizeof(ar[0]);
    linearSearch(ar,n,3);

}
