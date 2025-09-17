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



// for (j = 1; j <= i; j++) 
// prints 
/* 
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


