import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * String input_date="01/08/2012"; SimpleDateFormat format1=new
     * SimpleDateFormat("dd/MM/yyyy"); Date dt1=format1.parse(input_date);
     * DateFormat format2=new SimpleDateFormat("EEEE"); String
     * finalDay=format2.format(dt1); Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING. The function accepts following
     * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        Calendar c = Calendar.getInstance();
        c.set(year, month, day);
        String dayOfWeek = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
        return dayOfWeek.toUpperCase();

    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
