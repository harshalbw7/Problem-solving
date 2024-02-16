// Sample Input 0

// 5
// 47
// Sample Output 0

// thirteen minutes to six
// Sample Input 1

// 3
// 00
// Sample Output 1

// three o' clock
// Sample Input 2

// 7
// 15
// Sample Output 2

// quarter past seven

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
    
    static String[] numbers = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"
    };
    
    public static String timeInWords(int h, int m) {
        String time = "";
        
        if (m == 0) {
            time = numbers[h] + " o' clock";
        } else if (m == 1) {
            time = "one minute past " + numbers[h];
        } else if (m == 15) {
            time = "quarter past " + numbers[h];
        } else if (m == 30) {
            time = "half past " + numbers[h];
        } else if (m == 45) {
            time = "quarter to " + numbers[(h % 12) + 1];
        } else if (m < 30) {
            if (m <= 20) {
                time = numbers[m] + " minutes past " + numbers[h];
            } else {
                time = "twenty " + numbers[m - 20] + " minutes past " + numbers[h];
            }
        } else {
            m = 60 - m;
            if (m <= 20) {
                time = numbers[m] + " minutes to " + numbers[(h % 12) + 1];
            } else {
                time = "twenty " + numbers[m - 20] + " minutes to " + numbers[(h % 12) + 1];
            }
        }

        return time;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
