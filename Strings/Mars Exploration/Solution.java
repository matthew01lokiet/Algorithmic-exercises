import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {

        int changed = 0;

        String sos = "SOS";
        
        for(int i = 0; i < s.length()-2; i += 3)
        {
            String subSos = s.substring(i,i+3);
            
            for(int j = 0; j < 3; j++)
            {
                if(subSos.charAt(j) != sos.charAt(j))
                    changed++;
            }
                
        }
        
        return changed;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

