import java.util.*;

public class HashM
{
    static HashMap<Integer,String> hm = new HashMap<Integer,String>();
    static Scanner sc = new Scanner(System.in);
    public static void insert(int n,String s)
    {
        hm.put(n,s);
    }
    public static void delete(int n)
    {
        hm.remove(n);
    }
    public static void iter()
    {
        for(Map.Entry m:hm.entrySet())
        {
            System.out.print(m.getKey()+" "+m.getValue()+" ");
        }
    }
    public static void main(String args[])
    {
        int n,l;
        String s,s1;
        do {
            System.out.println("\nEnter operation no. \n 1 - Add \n 2 - Remove \n 3 - Iterate \n 4 - Exit");
            System.out.println("Enter choice - ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter element/string - ");
                    s=sc.next();
                    System.out.println("Enter location - ");
                    l=sc.nextInt();
                    insert(l,s);
                    break;
                case 2:
                    System.out.println("Enter element/string location to be removed - ");
                    l=sc.nextInt();
                    delete(l);
                    break;
                case 3:
                    iter();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        } while (n != 4);

    }
}
