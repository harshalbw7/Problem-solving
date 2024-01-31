// Sample Input 0
// 2
// 10
// 100
  
// Sample Output 0
// 23
// 2318

import java.util.Scanner;

public class Solution {

    public static long solution(int n) {
        n--;
        long sumDivisibleBy3 = sumDivisibleBy(n, 3);
        long sumDivisibleBy5 = sumDivisibleBy(n, 5);
        long sumDivisibleBy15 = sumDivisibleBy(n, 15);

        return sumDivisibleBy3 + sumDivisibleBy5 - sumDivisibleBy15;
    }

    private static long sumDivisibleBy(int n, int divisor) {
        long p = n / divisor;
        return divisor * (p * (p + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            System.out.println(solution(n));
        }
        in.close();
    }
}
