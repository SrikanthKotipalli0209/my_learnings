import java.util.Scanner;

class Calculator{

    public int add(int n1, int n2)
    {
        int r = n1+n2;
        return r;
    }
    public int sub(int n1, int n2)
    {
        int r1 = n1-n2;
        return r1;
    }
    public int mul(int n1, int n2)
    {
        int r2 = n1*n2;
        return r2;
    }
    public int div(int n1, int n2)
    {
        int r3 = n1/n2;
        return r3;
    }
    public int per(int n1, int n2)
    {
        int r4 = n1%n2;
        return r4;
    }


}
public class methods {

    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1=scan.nextInt();
        System.out.println("Enter num2 : ");
        int num2=scan.nextInt();
        scan.close();

        Calculator cal = new Calculator();

        int result = cal.add(num1, num2);
        int result1 = cal.sub(num1, num2);
        int result2 = cal.mul(num1, num2);
        int result3 = cal.div(num1, num2);
        int result4 = cal.per(num1, num2);

        System.out.println("addition : " + result);
        System.out.println("Substraction :" + result1);
        System.out.println("Multipilication :" + result2);
        System.out.println("Division :" + result3);
        System.out.println("Percentage :" + result4);



    }
    
}
