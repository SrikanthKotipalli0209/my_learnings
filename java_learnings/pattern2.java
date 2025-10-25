import java.util.*;
public class pattern2 {

    public static void main(String [] args)
    {
        int i;
        int j;
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
/* 
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n;j++)
            {
                if(j<=n-i)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();

        }
*/


        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j<=n-i)
                    System.out.print(" ");
                else
                    System.out.print("#");

            }
            System.out.println();
        }


    }
    
}
