import java.util.Scanner;
public class Factorial
{
    public static int fac(int n)
    {
        if(n==0 || n==1)
            return 1;
        return n*(fac(n-1));
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N - ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is - "+fac(n));
    }
}
