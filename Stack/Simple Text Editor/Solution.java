import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int queries = scanner.nextInt();
        
        Deque<String> ops = new LinkedList(); 
        
        StringBuilder text = new StringBuilder();
        
        for(int i = 0; i < queries; i++)
        {
            int option = scanner.nextInt();
            
            switch(option)
            {
                case 1:
                {
                    String toAppend = scanner.next();
                    
                    ops.push(text.toString());
                    
                    text.append(toAppend);
                    
                    break;
                }
                
                case 2:
                {
                    int howManyDelete = scanner.nextInt();
                    
                    ops.push(text.toString());
                    
                    text.delete(text.length()-howManyDelete, text.length());
                    
                    break;
                }
                
                case 3:
                {
                    int index = scanner.nextInt()-1;
                    
                    System.out.println(text.charAt(index));
                    
                    break;
                }
                
                case 4:
                {
                    if(ops.isEmpty())
                        break;
                    
                    text = new StringBuilder(ops.pop());
                    
                    
                }
            }
        }
        
    }
}
