// Sample Input 1
// 8
// 1
// 2
// 100
// 12303479849857341718340192371
// 3084193741082937
// 3084193741082938
// 111
// 200
  
// Sample Output 1
// 1
// 2
// 100
// 111
// 200
// 3084193741082937
// 3084193741082938
// 12303479849857341718340192371

import java.util.Arrays;
import java.util.Scanner;

public class BigSorting {

    public static String[] bigSorting(String[] unsorted) {
         
        Arrays.sort(unsorted, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return Integer.compare(a.length(), b.length());
        });

        return unsorted;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextLine();
        }
 
        String[] output = bigSorting(input);

        for (String s : output) {
            System.out.println(s);
        }
        scanner.close();
    }
}
