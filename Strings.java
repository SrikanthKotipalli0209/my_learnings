import java.util.*;

public class Strings {


    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("##########################");
        for(int i =1;i<=3;i++)
        {
            String s = scan.next();
            int x = scan.nextInt();
            int n = 0;
            if(s.length() < 15)
            {
                n = 15-s.length();
            }
            System.out.print(s);
            for(int j=0;j<n;j++)
            {

                System.out.print(" ");
            }
            if(x < 10)
                System.out.print("00" + x);
            if(x >=10 & x < 100)
                System.out.print("0" + x);
            if(x >= 100)
                System.out.print(x);
            
        }
        scan.close();
        System.out.println();
        System.out.println("##########################");
    }

}




/*
 * chatgpt code
 * 
 * import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("##########################");
        for (int i = 0; i < 3; i++) {
            String s = scan.next();
            int x = scan.nextInt();
            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("##########################");
        scan.close();
    }
}
 */
    

