#include <stdio.h>

void binarySearch(int arr[], int key, int len)
{
    int left = 0;
    int right = len;
    int mid;
    while (left <= right)
    {
        mid = (right + left) / 2;
        if (key == arr[mid])
        {
            printf("Key found : %d ", mid);
            return;
        }
        if (key < arr[mid])
            right = mid - 1;
        if (key > arr[mid])

            left = mid + 1;
    }
    printf("Not found");
    return;
}

int main()
{
    int arr[] = {2, 4, 6, 7, 10, 15};
    int len = sizeof(arr) / sizeof(arr[0]);
    binarySearch(arr, 57, len);

    return 0;
}