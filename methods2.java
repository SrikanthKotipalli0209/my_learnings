import java.util.Scanner;

class pen{

    public void buypen()
    {
        System.out.println("i am buying a pen");
    }

    public String purchused(int cost)
    {
        if (cost >=10)
            return "i brought a pen at : " + cost+"rps";
        return "Go Home and Bring min 10rps";

    }
}

public class methods2 {
    public static void main(String[] args)
    {

        pen obj = new pen();
        obj.buypen();
        pen obj2 = new pen();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your amount: ");
        int money = scan.nextInt();
        scan.close();
        String amount = obj2.purchused(money);

        System.out.println(amount);

    }
    
}
