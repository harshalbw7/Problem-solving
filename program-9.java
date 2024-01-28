// Sample Input 0
// 3
// Ab1

// Sample Output 0
// 3
 
// Sample Input 1
// 11
// #HackerRank

// Sample Output 1
// 1

import java.io.*;

class Result {

    public static int minimumNumber(int n, String password) {
        int missingCount = 0;
        if(!password.matches(".*\\d.*")){
            missingCount++;
            n++;
        } 
        if(!password.matches(".*[a-z].*")){
            missingCount++;
            n++;
        } 
        if(!password.matches(".*[A-Z].*")){
            missingCount++;
            n++;
        } 
        if(!password.matches(".*[-!@#$%^&*()+].*")){
            missingCount++;
            n++;
        } 
        if(n<6) missingCount += (6 - n);
        return missingCount;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
