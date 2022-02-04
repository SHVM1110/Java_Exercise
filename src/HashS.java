import java.util.*;

public class HashS
{
    static HashSet hs = new HashSet();
    static Scanner sc = new Scanner(System.in);
    public static void insert(String s)
    {
        hs.add(s);
    }
    public static void delete(String s)
    {
        hs.remove(s);
    }
    public static void iter()
    {
        Iterator itr = hs.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
    public static void main(String args[])
    {
        int n;
        String s,s1;
        do {
            System.out.println("\nEnter operation no. \n 1 - Add \n 2 - Remove \n 3 - Iterate \n 4 - Exit");
            System.out.println("Enter choice - ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter element/string - ");
                    s=sc.next();
                    insert(s);
                    break;
                case 2:
                    System.out.println("Enter element/string to be removed - ");
                    s=sc.next();
                    delete(s);
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
