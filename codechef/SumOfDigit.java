import java.util.Scanner;

class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int no = sc.nextInt();
        int sum = 0;
        int temp;
        while (T > 0) {

            while (no > 0) {
                temp = no % 10;
                sum = sum + temp;
                no = no / 10;
            }

        }
        System.out.println(sum);

    }
}