import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int lowestTriangle(int base, int area){
        
        int toReturn = 1;
        
        for(int h = 1; h < Integer.MAX_VALUE; h++)
        {
            if(((h*base)/2) >= area)
            {
                toReturn = h;
                break;
            }
        }
        
        return toReturn;
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int area = in.nextInt();
        int height = lowestTriangle(base, area);
        System.out.println(height);
    }
}

