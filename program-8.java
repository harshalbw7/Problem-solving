// Sample Input 0
// aaabccddd
  
// Sample Output 0
// abd 
  
// Sample Input 1
// aa
  
// Sample Output 1
// Empty String

import java.io.*;
import java.util.*;

class Result {
 
    public static String superReducedString(String s) {
         Map<Character, Integer> count = new HashMap<>();
         for(int i=0; i<s.length(); i++){
             count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0)+1);
         } 
         StringBuilder result = new StringBuilder();
         for(char i : count.keySet()){
            if(count.get(i) % 2 == 1){
                result.append(i); 
            } 
         }
         if(result.toString().isEmpty()){
            return "Empty String"; 
         } 
         return result.toString();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(Result.superReducedString(sc.nextLine()));
        sc.close();
    }
}
