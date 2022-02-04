import java.util.*;
import java.io.*;
public class Anagram
{
    public static boolean checkanagram(char[] s1,char[] s2)
    {
        int n1=s1.length,n2=s2.length;
        if(n1!=n2)
        {
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<n1;i++)
        {
            if(s1[i]!=s2[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 - ");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2 - ");
        String s2 = sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        if (checkanagram(c1, c2))
            System.out.println("The two strings are " + "anagram of each other");
        else
            System.out.println("The two strings are not " + " anagram of each other");
    }
}
