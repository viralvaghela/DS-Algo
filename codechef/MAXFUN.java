import java.util.Arrays;
import java.util.Scanner;

class MAXFUN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {

            int size = sc.nextInt();
            long arr[] = new long[size];
            long max = arr[0];
            long min = arr[0];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            // System.out.println("Max:" + min);

            // int ans = (max - min);
            System.out.println(Math.abs((arr[0] - arr[size - 1]) * 2));
            T--;
        }

    }
}
