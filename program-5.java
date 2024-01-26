Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
######

import java.io.*;

class Result {
 
    public static void staircase(int n) {
    for(int i=0; i<n; i++){
        for(int k=n-i-1; k>0; k--){
            System.out.print(" ");
        }
        for(int j=0; j<=i; j++){
            System.out.print("#");
        }
        System.out.println();
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
