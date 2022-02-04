import java.util.Scanner;
public class RemoveChar
{
    public static String Remove(String s,int n)
    {
        return s.substring(0,n)+s.substring(n+1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.next();
        System.out.println("Enter number :");
        int n=0;
        n=sc.nextInt();
        System.out.println("Entered String : "+s);
        System.out.println("New String : "+Remove(s,n));
    }
}
