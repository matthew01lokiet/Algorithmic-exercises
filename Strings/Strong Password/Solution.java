import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
            
            int requNumb = 0;
            
            if(password.matches(".*[0123456789].*"))
                requNumb++;
                
            if(password.matches(".*[abcdefghijklmnopqrstuvwxyz].*"))
                requNumb++;
                
            if(password.matches(".*[ABCDEFGHIJKLMNOPQRSTUVWXYZ].*"))
                requNumb++;
                
            if(password.matches(".*[!@#$%^&*()+-].*"))
                requNumb++;
                
            if((4 - requNumb + n) <= 6)
                return 6-n;
                
            return (4-requNumb);
            
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

