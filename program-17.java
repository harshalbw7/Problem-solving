// Sample Input 0
// 7 11
// 5 15
// 3 2
// -2 2 1
// 5 -6
  
// Sample Output 0
// 1
// 1

import java.util.*;

class Result {
 
    public static void countApplesAndOranges(int s, int t, int d, List<Integer> fruits){
        int count = 0;
        for(int point : fruits){
            int distance = d + point;
            if(distance >= s && distance <= t){
                count++;
            }
        }
        System.out.println(count);
    }

}

public class Solution {
    public static void main(String[]args) {
        Scanner sc =new Scanner(System.in);
 
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        List<Integer> apples = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            apples.add(sc.nextInt());
        }
        
        List<Integer> oranges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            oranges.add(sc.nextInt());
        }
        
        Result.countApplesAndOranges(s, t, a, apples);
        Result.countApplesAndOranges(s, t, b, oranges);
        sc.close();
    }
}
