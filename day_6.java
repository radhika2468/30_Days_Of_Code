import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int j=0;j<n;j++)
        {
           String str=scan.next();
          
        
           for(int i=0;i<str.length();i++)
           { 
             if(i%2==0)
             {
                System.out.print(str.charAt(i));
             }
            }
            System.out.print(" ");
            for(int i=0;i<str.length();i++)
            { 
              if(i%2!=0)
              {
                System.out.print(str.charAt(i));
              }
            }
            System.out.println();
        }
    }
}
