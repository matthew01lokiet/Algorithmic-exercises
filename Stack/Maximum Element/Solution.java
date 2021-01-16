import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        
        Deque<Integer> stack = new LinkedList();
        Deque<Integer> maxStack = new LinkedList();

        for(int i = 0; i < queries; i++)
        {
            int queryType = scanner.nextInt();
            
            switch(queryType)
            {
                case 1:
                {
                    int ele = scanner.nextInt();
                    
                    if(stack.isEmpty())
                        maxStack.push(ele);
                    else if(ele > maxStack.peek())
                        maxStack.push(ele);
                    else
                        maxStack.push(maxStack.peek());
                        
                    stack.push(ele);
                    
                    break;
                }
                
                case 2:
                {
                    stack.pop();
                    maxStack.pop();
                    
                    break;
                }
                
                
                case 3:
                {
                    
                    System.out.println(maxStack.peek());
                }
            }
            
            
        }
        
    }
}
