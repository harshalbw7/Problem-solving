// Sample Input

// STDIN   Function
// -----   --------
// 3       t = 3 (test cases)
// 10 2 5  n = 10, c = 2, m = 5 (first test case)
// 12 4 4  n = 12, c = 4, m = 4 (second test case)
// 6 2 2   n = 6,  c = 2, m = 2 (third test case)
  
// Sample Output

// 6
// 3
// 5

import java.io.*;
import java.util.stream.*;

class Result {

    public static int chocolateFeast(int n, int c, int m) {
        int chocolates = n / c;
        int wrappers = chocolates;
 
        while (wrappers >= m) {
            int additionalChocolates = wrappers / m;
            chocolates += additionalChocolates;
            wrappers = wrappers % m + additionalChocolates;
        }
        return chocolates;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int c = Integer.parseInt(firstMultipleInput[1]);

                int m = Integer.parseInt(firstMultipleInput[2]);

                int result = Result.chocolateFeast(n, c, m);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
