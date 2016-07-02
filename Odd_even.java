
package number;

import java.util.Scanner;


public class Odd_even {
 public static void main(String[] args)
 {
  System.out.println("Enter a number");
 Scanner ob=new Scanner(System.in);
 int n=ob.nextInt();

if(n>0)
{
    System.out.println("number is positive");
}
else if(n==0)
{
    System.out.println("number is zero");
}
else
{
    System.out.println("number is negative");
}
    }
    
}
