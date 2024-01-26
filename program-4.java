// Sample Input

// STDIN           Function
// -----           --------
// 6               arr[] size n = 6
// -4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]

// Sample Output

// 0.500000
// 0.333333
// 0.166667

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
 
    public static void plusMinus(int n, List<Integer> arr) {
        double positive = 0;
        double negative = 0;
        double zero = 0;
        double total = 0;
        for(int i=0; i<n; i++){
            if(arr.get(i) > 0){
                positive++;
                total++;
            }
            else
            if(arr.get(i) < 0){
                negative++;
                total++;
            }
            else{
                zero++;
                total++;
            }
        }
        System.out.printf("%f\n%f\n%f", positive / total, negative / total, zero / total);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(n,arr);

        bufferedReader.close();
    }
}
