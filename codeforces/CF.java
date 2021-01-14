import java.util.Scanner;

class CF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            int counter = 0;
            long w = sc.nextLong();
            long n = sc.nextLong();

            while (h > 0 || w > 0) {

                if (w % 2 == 0 || w == 1 || h == 1) {
                    counter++;
                    w = w / 2;
                }
                if (h % 2 == 0 || w == 1 || h == 1) {
                    counter++;
                    h = h / 2;
                } else
                    break;

            }
            counter++;

            // System.out.println(counter);
            if (counter >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            T--;
        }
    }
}