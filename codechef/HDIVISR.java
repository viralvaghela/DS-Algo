import java.util.*;
class HDIVISR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int max=0;
        int counter=1;
        while(counter<  10)
        {
            if(n%counter==0)
            max=counter;
            counter++;
        }
        System.out.println(max);
    }
}