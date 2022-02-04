import java.util.Scanner;
public class Table
{
    public static void multiply(int n,int l)
    {
        for(int i=1;i<=l;i++)
        {
            System.out.println(n+" x "+i+" - "+n*i+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Enter length: ");
        int l=sc.nextInt();
        multiply(n,l);

    }
}
