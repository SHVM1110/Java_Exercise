import java.util.Scanner;
public class Palindrome
{
    public static String rev(String s)
    {
        if(s==null || s.isEmpty())
        {
            return s;
        }
        return s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));
    }
    public static boolean Check(String s)
    {
        String re=rev(s);
        if(s.equals(re))
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.next();
        System.out.println("String "+s+" is a Palindrome : "+Check(s));

    }
}
