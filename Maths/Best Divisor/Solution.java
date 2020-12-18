import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        List<Integer> divisors = new ArrayList();
        
        for(int i = 1; i < n/2+1; i++)
        {
            if(n % i == 0)
                divisors.add(i);
        }
        
        divisors.add(n);
        
        int toRet = Integer.MAX_VALUE;
        int maxSum = -1;
        int sum = 0;
        
        for(Integer divisor : divisors)
        {
            sum = 0;
            Integer currentDiv = divisor;
            
            while(currentDiv != 0)
            {
                sum += (currentDiv % 10);
                currentDiv /= 10;
            }
            
            if(sum > maxSum)
            {
                toRet = divisor;
                maxSum = sum;
            }
            
            
        }
        
        System.out.println(toRet);

        scanner.close();
    }
}

