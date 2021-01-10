import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {

        int storedValue = arr[n-1];
        
        int i = n-1;
        
        if(arr[i-1] <= storedValue)
            return;
        
        int temp;
        
        while(i > 0 && arr[i-1] > storedValue )
        {
            arr[i] = arr[i-1];
            Arrays.stream(arr).forEach( integer -> System.out.printf("%d ", integer ) );
            System.out.println();
            i--;
        }
        
        if(i == 0)
        {
            
        }
        
        arr[i] = storedValue;
        Arrays.stream(arr).forEach( integer -> System.out.printf("%d ", integer ) );
        
        return;
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

        insertionSort1(n, arr);

        scanner.close();
    }
}
