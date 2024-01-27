// Sample Input

// 20 23 6

// Sample Output

// 2

import java.io.*;

class Result {
    
    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        while(i<=j){
            StringBuilder builder = new StringBuilder(String.valueOf(i));
            String s = builder.reverse().toString();
            double rev = Double.parseDouble(s);
            double mod = Math.abs(i-(rev))/k;
            if((mod % 1) == 0) count++;
            i++;
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
