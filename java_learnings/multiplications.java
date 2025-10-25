import java.util.*;
public class multiplications {


    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        for(int i =0;i <=10;i++)
        {
            //System.out.println(n + " x " + i + " = " + (n * i));
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }
    
}
