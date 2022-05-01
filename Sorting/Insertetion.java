 import java.io.*;
import java.util.*;

 class InsertionSort {

  public static void insertionSort(int[] arr) {
    int val,hole;
  
    for(int i=1;i<=arr.length-1;i++)
    {
         val=arr[i];
        hole = i;
        while(hole>0 && arr[hole-1]>val)
        {
            arr[hole]=arr[hole-1];
            hole=hole-1;

        }
        arr[hole]=val;  
    }
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    int[] arr = {5,4,3,2,1};

    insertionSort(arr);
    print(arr);
  }

} 