import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pangrams function below.
    static String pangrams(String s) {

        boolean[] asciiCodes = new boolean[91];

        for(char letter : s.toCharArray())
        {
            if((int)letter == 40)
                continue;
            else if((int)letter > 90 )
                asciiCodes[(int)letter - 32] = true;
            else
                asciiCodes[(int)letter] = true;
        }
        
        for(int i = 65; i < 91; i++)
        {
            if(!asciiCodes[i])
                return "not pangram";
        }
        
        return "pangram";
            
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

