// Sample Input
// 8
// UDDDUDUU
  
// Sample Output
// 1

import java.io.*;

class Result {

    public static int countingValleys(int steps, String path) {
        int level = 0;
        int valley = 0;
        for(char step : path.toCharArray()){
            if(step == 'U') level++;
            else level--;
            if(step == 'U' && level == 0) valley++;
        }
        return valley;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
