
/*Task
Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
*/



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class if_condition {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if(n%2 == 1){
            System.out.println("Weird");
        }
        if(n%2 ==0 && n >=2 && n <=5){
            System.out.println("Not Weird");
        }
        if(n%2==0 && n >=6 && n <=20)
        {
            System.out.println("Weird");
        }
        if(n%2 ==0 && n >20){
            System.out.println("Not Weird");
        }

    }
    
}
