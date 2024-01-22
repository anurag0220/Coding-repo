//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        int major=a[0];
        int vote=1;
        for(int i=1;i<a.length;i++)
        {
            if(vote==0)
            {
                vote++;
                major=a[i];
            }
            else if(major==a[i])
            {
                vote++;
            }
            else{
                vote--;
            }
        }
        vote=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==major)
            {
                vote++;
            }
        }
        if(vote>a.length/2)
        {
            return major;
        }
        return -1;
        // your code here
    }
}