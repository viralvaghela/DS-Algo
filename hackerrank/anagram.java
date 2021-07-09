import java.util.Arrays;
import java.util.Scanner;

class Solution {

    static boolean isAnagram(String a, String b) {
        boolean flag = true;
        if (a.length() != b.length())

            flag = false;

        else {
            char[] aChars = a.toLowerCase().toCharArray();
            char[] bChars = b.toLowerCase().toCharArray();

            java.util.Arrays.sort(aChars);
            java.util.Arrays.sort(bChars);

            for (int i = 0; i < aChars.length; i++) {
                if (aChars[i] != bChars[i])
                    flag = false;
            }

        }
        return flag;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
