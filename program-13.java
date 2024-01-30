// Sample Input
// 5
// 2 4 6 8 3
  
// Sample Output
// 2 4 6 8 8 
// 2 4 6 6 8 
// 2 4 4 6 8 
// 2 3 4 6 8 

import java.io.*;
import java.util.*;

class Result {
 
    public static void insertionSort1(int n, List<Integer> arr) {
        int last = arr.get(n-1);
       
        for(int i=n-2; i>=0; i--){
            if(arr.get(i) >= last){
                arr.add(i+1, arr.get(i));
                arr.remove(i+2);
            }
            else{
                arr.add(i+1, last);
                arr.remove(i+2);
            }
            show(arr);
            
            if(last > arr.get(i)) break;
            
            if(i == 0){
                arr.add(i, last);
                arr.remove(i+2);
                show(arr);
            }
        }
    }
    public static void show(List<Integer> arr){
        for(int num : arr)
                    System.out.print(num+" ");
                System.out.println();
    }
    
}

public class Solution {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        List<Integer> arr = new ArrayList<>();
        int m = n;
        while(n>0){
            arr.add(sc.nextInt());
            n--;
        }
        sc.close();
        Result.insertionSort1(m, arr);
    }
}
