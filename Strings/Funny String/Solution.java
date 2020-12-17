import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s) {

            StringBuilder normalStr = new StringBuilder(s);
            StringBuilder reversStr = new StringBuilder(s);
            reversStr.reverse();
            
            int[] adjListNor = new int[s.length()-1];
            int[] adjListRev = new int[s.length()-1];
            
            for(int i = 0; i < s.length()-1; i++)
            {
                adjListNor[i] = Math.abs(normalStr.charAt(i)-normalStr.charAt(i+1));
                adjListRev[i] = Math.abs(reversStr.charAt(i)-reversStr.charAt(i+1));
                
                if(adjListNor[i] != adjListRev[i])
                    return "Not Funny";
            }
        
        return "Funny";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

