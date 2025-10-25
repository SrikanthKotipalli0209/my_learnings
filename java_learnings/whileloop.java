public class whileloop {

    public static void main(String[] args)
    {
        int i = 1;

        while(i<=5)
        {
            System.out.println(i);

            int j = 1;
            while(j<=i)
            {
                System.out.println("Good Morning" + j);
                j++;
                
            }
           i++;
               
        }
        System.out.println("Thank you \n" +"values of i : "+ i);
       
    }
    
}
