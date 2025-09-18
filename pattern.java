public class pattern {


    public static void main(String[] args)
    {
        int i;
        int j;
        int n =6;


        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
        
                for (j = 1; j<=i; j++) { 
                    System.out.print("#");
                }
            

        System.out.println();

        }


    }
    
}



/*  
for(i=1;i<=6;i++)
    {
        for (j = 1; j <= i; j++) 
        {
            System.out.println("#");
        }
    }
prints 
#
##
###
####
#####
###### 
*/


/*
 for (j = i; j <= 6; j++) || for (j = 6; j>= i; j--)
prints 
######
#####
####
###
##
#
 */


/*
 * for(i=1;i<=6;i++)
        {
            for(j=1;j<=6-i;j++){
                System.out.print(" ");
            }
        
                for (j = 1; j<=i; j++) { 
                    System.out.print("#");
                }
prints 
     #
    ##
   ###
  ####
 #####
######
 */
/*
 * for(i=n;i>=1;i--)
        {
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
                for (j = 1; j<=i; j++) { 
                    System.out.print("#");
                }
prints 
######
 #####
  ####
   ###
    ##
     #
 */


 /*
  * Traingle 
  for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   "); // 3 spaces to match " # " width
            }
            for(int j =1;j<=2*i-1;j++)
            {
                System.out.print(" # ");

            }
            
            System.out.println();
        }
  */



/*
 * inverted Triangle 
 * for (int i = n; i >= 1; i--) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   "); // 3 spaces to match " # " width
            }
            for(int j =1;j<=2*i-1;j++)
            {
                System.out.print(" # ");

            }
            
            System.out.println();
        }

 */

