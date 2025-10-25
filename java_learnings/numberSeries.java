import java.util.*;
public class numberSeries 
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        
        int k = 0;
        int g=0;

        for(int i =0;i<t;i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            for(int j =0;j<n;j++)
            {
                k = k +(int)Math.pow(2, j)*b;
                g= a+k;
                System.out.print(g + " ");
    
            }
            k =0; 
            System.out.println();
            
        }
        scan.close();

    }
    
}
