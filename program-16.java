// Sample Input 0
// 2
// 10
// 17

// Sample Output 0
// 5
// 17

import java.util.Scanner;

public class LargestPrimeFactor {

    public static long largestPrimeFactor(long n) {
        long largestFactor = 1;

        // Check for 2 as a factor repeatedly
        while (n % 2 == 0) {
            largestFactor = 2;
            n /= 2;
        }

        // Check for odd factors starting from 3
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }

        // If n is a prime number greater than 2
        if (n > 2) {
            largestFactor = n;
        }

        return largestFactor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for (int i = 0; i < t; i++) {
            long n = in.nextLong();
            System.out.println(largestPrimeFactor(n));
        }
        
        in.close();
    }
}
