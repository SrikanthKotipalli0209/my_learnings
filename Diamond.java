import java.util.*;
public class Diamond {

    public static void main(String[] args) 
    {
        int row =0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        for(int i =1;i<=2*n-1;i++)
        {
            if(i <= n)
                row = i;
            else
                row = 2*n-i;

            for(int j = 1; j<= n - row;j++)
            {
                System.out.print("   ");
            }
            for(int j =1;j<=2*row-1;j++)
            {
                System.out.print(" # ");
            }
        System.out.println();
        }

    }
    
}
