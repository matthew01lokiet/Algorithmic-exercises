import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the introTutorial function below.
    static int introTutorial(int V, int[] arr) {

        return binarySearch(arr, V, true);
    }
    
    public static int binarySearch(int[] input, int numb, boolean findFirstDuplicateValue)
    {
        
        int start = 0;
        int end = input.length;
        
        int mid = (end+start)/2;
        
        while(numb != input[mid])
        {
            if(input[mid] > numb)
            {
                end = mid;
                mid = (end+start)/2;
            }
            else
            {
                start = mid;
                mid = (end+start)/2;
            }
        }
        
        if(!findFirstDuplicateValue)
            return mid;
        else
        {
            while(mid > -1 && input[mid] == numb)
                mid--;
        }
        
        return ++mid;
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int V = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = introTutorial(V, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
