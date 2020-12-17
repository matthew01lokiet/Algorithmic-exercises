import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {

        int[] asciiTab = new int[(int)('z')+1];
        
        for(String word : arr)
        {
            for(int i = (int)('a'); i < (int)('z')+1; i++)
                if( word.matches(".*[" + Character.toString((char)i) + "].*") )
                    asciiTab[i]++;
        }
        
        int gems = 0;
        
        for(int i = (int)('a'); i < (int)('z')+1; i++)
            if(asciiTab[i] == arr.length)
                gems++;
                
        return gems;
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

