import java.io.*;
import java.util.*;

 class Main {

  public static void selectionSort(int[] arr) {
  
    for(int i=0;i<arr.length-1;i++)
    {
        int min = i;
      for(int j=i+1;j<arr.length;j++)
      {
          if(arr[j]<arr[min])
          {
              min = j;
          }
          int temp=arr[i];
          arr[i]=arr[min];
          arr[min]=temp;     
      }
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
    int[] arr = {5, 4, 3, 2, 1};

    selectionSort(arr);
    print(arr);
  }

}