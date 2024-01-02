//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        HashMap<Character,Character> m=new HashMap<>();
        m.put(')','(');
        m.put(']','[');
        m.put('}','{');
        Stack<Character> s=new Stack<Character>();
        int n=x.length();
        for(int i=0;i<n;i++){
           if(!s.isEmpty() && m.get(x.charAt(i))==s.peek())
           s.pop();
           else
           s.push(x.charAt(i));
        }
        return s.isEmpty();
        // add your code here
    }
}
