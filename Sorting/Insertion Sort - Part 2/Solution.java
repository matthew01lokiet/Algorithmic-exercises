import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {

        int unsortedIndex = 1;
        int temp;
        
        while(unsortedIndex != n)
        {
            
            for( int i = unsortedIndex; i > 0; i-- )
            {
                if(arr[i-1] > arr[i])
                {
                    temp = arr[i];
                    
                    arr[i] = arr[i-1];
                    
                    arr[i-1] = temp;
                }
                else
                    break;
            }
            
            for(int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
                
            System.out.println();
            
            unsortedIndex++;
        }
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}
