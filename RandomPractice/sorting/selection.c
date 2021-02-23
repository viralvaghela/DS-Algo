#include <stdio.h>
void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

void selectionSort(int ar[], int n)
{
    int i, j, minIndex;
    for (i = 0; i < n - 1; i++)
    {
        minIndex = i;
        for (j = i + 1; j < n; j++)
        {
            if (ar[j] < ar[minIndex])
                minIndex = j;
        }
        swap(&ar[minIndex], &ar[i]);
    }
}

void printArray(int ar[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", ar[i]);
    }
}
void main()
{
    int ar[] = {5, 2, 4, 3, 7};
    int n = sizeof(ar) / sizeof(ar[0]);
    selectionSort(ar, n);

    printArray(ar, n);
}