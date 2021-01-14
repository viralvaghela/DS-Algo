import java.util.Scanner;

class Csub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int length = sc.nextInt();
            String s = sc.next();
            int n = 0;
            for (int i = 0; i < length; i++) {
                if (s.charAt(i) == '1')
                    n++;
            }
            System.out.println((n*(n+1))/2);

            T--;
        }
    }
}
