import java.util.*;

public class Fact {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            while (T > 0) {
                int ans = 1;
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    ans = ans * i;
                }
                System.out.println(ans);
                T--;
            }

        } catch (Exception e) {
        }

    }

}
