// Sample Input 0
// 6
// 2
  
// Sample Output 0
// 1
  
// Sample Input 1
// 5
// 4
  
// Sample Output 1
// 0
  
import java.io.*;

class Result {
 
    public static int pageCount(int n, int p) {
        int fromStart = p / 2;
        int fromEnd = (n / 2) - (p / 2);
        System.out.println(fromStart+" "+fromEnd);
        return Math.min(fromStart, fromEnd);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
