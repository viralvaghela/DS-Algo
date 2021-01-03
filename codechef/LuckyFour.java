/*
Input
The first line of input consists of a single integer T, denoting the number of integers in Kostya's list.

Then, there are T lines, each of them contain a single integer from the list.

Output
Output T lines. Each of these lines should contain the number of occurences of the digit 4 in the respective integer from Kostya's list.

Constraints
1 ≤ T ≤ 105
(Subtask 1): 0 ≤ Numbers from the list ≤ 9 - 33 points.
(Subtask 2): 0 ≤ Numbers from the list ≤ 109 - 67 points.
Example
Input:
5
447474
228
6664
40
81

Output:
4
0
1
1
0
*/

import java.util.Scanner;

class LuckyFour {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T > 0) {

                int counter = 0;
                String no = sc.next();
                for (int i = 0; i < no.length(); i++) {
                    if (no.charAt(i) == '4') {
                        counter++;
                    }
                }
                System.out.println(counter);
                T--;
            }
        } catch (Exception e) {
        }
    }
}