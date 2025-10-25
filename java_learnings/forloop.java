public class forloop {
    
    public static void main(String [] args)
    {

        String day1 = "Monday";
        String day2 = "Tuesday";
        String day3 = "Wednesday";
        String day4 = "Thrusday";
        String day5 = "Friday";

        String task1 = "Go to office";
        String task2 = "Check mails";
        String task3 = "Check the slack";
        String task4 = "Attend team meeting";
        String task5 = "Start work";
        String task6 = "Have lunch";
        String task7 = "Connect with team mates";
        String task8 = "Finish the day task";
        String task9 = "Go to Home";



        System.out.println("######## Week Schedule ########");


        int i;
        int j;

        for(i=1;i<=5;i++)
        {
            switch (i) {
                case 1:
                    System.out.println(i + " " + day1);           //if(i==1) System.out.println(i+ " " + day1).  withour switch
                    break;
                 case 2:
                    System.out.println(i + " " + day2);
                    break;
                 case 3:
                    System.out.println(i + " " + day3);
                    break;
                 case 4:
                    System.out.println(i + " " + day4);
                    break;
                 case 5:
                    System.out.println(i + " " + day5);
                    break;
            
                default:
                    break;
                    
            }
            for(j=1;j<=9;j++)
            {
                switch (j) {
                case 1:
                    System.out.println((j+8)+"-"+ (j+9) + " " + task1);
                    break;
                 case 2:
                    System.out.println((j+8)+"-"+ (j+9) + " " + task2);
                    break;
                 case 3:
                    System.out.println((j+8)+"-"+ (j+9) + " " + task3);
                    break;
                 case 4:
                    System.out.println((j+8)+"-"+ (j+9) + " " + task4);
                    break;
                 case 5:
                    System.out.println((j+8)+"-"+ (j+9) + " " + task5);
                    break;
                case 6:
                    System.out.println((j+8)+"-"+ (j+9) + " " + task6);
                    break;
                case 7:
                    System.out.println((j+8)+"-"+ (j+9) + " " + task7);
                    break;
                case 8:
                    System.out.println((j+8)+"-"+ (j+9) + " " + task8);
                    break;
                case 9:
                    System.out.println((j+8)+"-"+ (j+9) + " " + task9);
                    break;
                default:
                    break;
                    
            }
                
            }

        }
        System.out.println("Enjoy the weekend !!!!");
    }
}
