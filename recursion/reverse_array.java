class reverse_array {
    public static void main(String[] args) {
        int[] arr = { 10,9,8,7,6,5,4,3,2,1,0};
        int l = 0;
        reverse(arr, l);

        //print array
        for(int i = 0 ;i<arr.length;i++)
        {
            System.out.print (arr[i]+" ");
        }
    }

    public static void reverse(int arr[], int l) {

        if (l >= l-1-arr.length)
            return;
        else {
            //swap
            int temp = arr[l-1-arr.length];
            arr[l-1-arr.length]=arr[l];
            arr[l]=temp;
            l++;
            reverse(arr, l);
        }

    }
}