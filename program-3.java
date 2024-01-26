// Sample Input

// 3
// 11 2 4
// 4 5 6
// 10 8 -12

// Sample Output

// 15

import java.io.*;
import java.util.*;

class Result {
 
    public static int diagonalDifference(int n,List<List<Integer>> arr) {
        int sumPrimary = 0;
        int sumSecondary = 0;
        int difference = 0;
        
        for (int i = 0; i < n; i++) {
            sumPrimary += arr.get(i).get(i);
            sumSecondary += arr.get(i).get(n - (i+1));
        }
        difference = sumPrimary - sumSecondary;
        if(difference < 0){
            difference = - difference;
        }
        return difference;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> innerList = new ArrayList<>();
            String[] elements = bufferedReader.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                    int element = Integer.parseInt(elements[j]);
                    innerList.add(element);
            }
            arr.add(innerList);
        }
        
        System.out.print(Result.diagonalDifference(n,arr));
         
    }
}
