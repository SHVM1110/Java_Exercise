import java.util.Scanner;
public class Calculator
{
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Sum - "+c);
    }
    public void sub(int a,int b)
    {
        int c=a-b;
        System.out.println("Sub - "+c);
    }
    public void mul(int a,int b)
    {
        int c=a*b;
        System.out.println("Multi - "+c);
    }
    public void div(float a,float b)
    {
        if(a>b)
        {
            float c=a/b;
            System.out.println("Div - "+c);
        }
        else
        {
            System.out.println("");
        }

    }
    public static void main(String args[]) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter number 1 - ");
            int a = sc.nextInt();
            System.out.println("Enter number 2- ");
            int b = sc.nextInt();
            System.out.println("Enter operation no. \n 1 - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide \n 5 - Exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    cal.add(a, b);
                    break;
                case 2:
                    cal.sub(a, b);
                    break;
                case 3:
                    cal.mul(a, b);
                    break;
                case 4:
                    cal.div(a, b);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        } while (n != 5);

    }
}
