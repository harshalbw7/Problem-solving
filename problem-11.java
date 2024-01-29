// Sample Input 0
// 2
// hereiamstackerrank
// hackerworld

// Sample Output 0
// YES
// NO

// Sample Input 1
// 2
// hhaacckkekraraannk
// rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt

// Sample Output 1
// YES
// NO

import java.io.*;
b
import java.util.stream.*;

class Result {

    public static String hackerrankInString(String s) {
        String hackerrank = "hackerrank";
        int index = 0;
        for (char c : s.toCharArray()) {
            if (index < hackerrank.length() && c == hackerrank.charAt(index)) {
                index++;
            }
        }
        return (index == hackerrank.length()) ? "YES" : "NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.hackerrankInString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
