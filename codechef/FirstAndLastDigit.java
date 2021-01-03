/*
If Give an integer N . Write a program to obtain the sum of the first and last digits of this number.

Input
The first line contains an integer T, the total number of test cases. Then follow T lines, each line contains an integer N.

Output
For each test case, display the sum of first and last digits of N in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ N ≤ 1000000
Example
Input
3 
1234
124894
242323

Output
5
5
5

*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
       try {    
           int T=sc.nextInt();
           while(T>0)
           {
                String no=sc.next();
                String first = String.valueOf(no.charAt(0));
                String last = String.valueOf(no.charAt(no.length() - 1));
                int no1=Integer.valueOf(first);
                int no2=Integer.valueOf(last);
        
                System.out.println(no1+no2);   
                T--;
           }
           
       } catch(Exception e) {}
    }
}
    