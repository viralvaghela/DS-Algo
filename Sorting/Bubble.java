import java.io.*;
import java.util.*;

 class Main {

  public static void bubbleSort(int[] arr) {
  
    for(int i=1;i<arr.length;i++)
    {
      for(int j=0;j<=(arr.length-i-1);j++)
      {
          if(arr[j]>arr[j+1])
          {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
          }
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

    bubbleSort(arr);
    print(arr   );
  }

}