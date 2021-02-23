#include <stdio.h>

/********  Bubble Sort *********/
void printArray(int ar[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", ar[i]);
    }
}
void bubbleSort(int ar[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (ar[j] > ar[j + 1])
            {
                int temp = ar[j + 1];
                ar[j + 1] = ar[j];
                ar[j] = temp;
            }
        }
    }
}



void main()
{
    int ar[] = {5, 1, 2, 4, 3, 7};
    int n = sizeof(ar) / sizeof(ar[0]);
    bubbleSort(ar, n);
  
    printArray(ar, n);
}
