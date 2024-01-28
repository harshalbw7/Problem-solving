// Sample Input 0
// aba
// 10
  
// Sample Output 0
// 7
  
// Sample Input 1
// a
// 1000000000000
  
// Sample Output 1
// 1000000000000
  
import java.io.*;
 
class Result {
 
    public static long repeatedString(String s, long n) {
        long countInSingle = countA(s);
        long fullRepeat = n / s.length();
        long remainingChars = n % s.length();

        long totalCount = fullRepeat * countInSingle + countA(s.substring(0, (int) remainingChars));

        return totalCount;
    }

    static long countA(String s) {
        long count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
