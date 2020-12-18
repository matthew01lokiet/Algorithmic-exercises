import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static int solve(int n) {

        int number = n;
        
        int factorSum = 0;
        int digitSum = 0;
        
        for (int i = 2; i <= n; i++) 
        {
            while (n % i == 0) 
            {
                
                int numb = i;
                
                while(numb != 0)
                {
                    factorSum += (numb%10);
                    numb /= 10;
                }
                n /= i;
            }
        }
        
        while(number != 0)
        {
            digitSum += (number%10);
            number /= 10;
        }
        
        if(factorSum == digitSum)
            return 1;
        else
            return 0;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = solve(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

