import java.util.*;
public class pattern3 {


    public static void main(String[] args)
    {
        int i,j;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1 || j ==1 || i == n || j == n)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
