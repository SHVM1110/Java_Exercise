import java.util.Scanner;
public class DuplicateChar
{
    static final int n=256;
    public static void countchar(String s, int[] c)
    {
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i)]++;
        }
    }
    public static void print(String s)
    {
        int c[]= new int[n];
        countchar(s,c);
        for(int i=0;i<n;i++)
        {
            if(c[i]>1)
            {
                System.out.println((char)i+" count - "+c[i]);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        print(s);
    }
}
