// Sample Input 0
// 2
// 10
// 100
  
// Sample Output 0
// 10
// 44

import java.util.*;

public class evenFiboSum {
    public static void fibonacci(long n){
        long a1 = 0l;
        long a2 = 1l;
        long sum = 0l;
        while(a1 < n){
            if(a1 % 2 == 0){
                sum = sum + a1;
            }
            long a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            long n = in.nextLong();
            fibonacci(n);
        }
        in.close();
    }
}
