public class cal {


    public static void main(String [] args)
    {
        int i;
        int j=1;

        System.out.printf("   S   M   T   W   T   F   S");
        System.out.println();
       // System.out.print("   ");
        for(j=1;j<=31;j++)
            {
                
                System.out.printf("%4d", j );
                if(j%7==0)
                System.out.println();
            }

        System.out.println();
    }
    
}
