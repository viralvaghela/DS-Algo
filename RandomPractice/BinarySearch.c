#include <stdio.h>

void binarySearch(int arr[], int key, int len)
{
    int low = 0;
    int high = len;
    int mid;
    while (low < high)
    {
        mid = (high + low) / 2;
        if (key == mid)
        {
            printf("Key found : %d " , arr[mid]);
            return;
        }
        else if (key < arr[mid])
            low = mid + 1;
        else if (key > arr[mid])
            high = mid - 1;
        else {
            printf("Not found");
        }
    }
}

int main()
{
    int arr[] = {2, 4, 6, 7, 10, 15};
    int len = sizeof(arr) / sizeof(arr[0]);
    binarySearch(arr, 7, len);

    return 0;
}