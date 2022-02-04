import java.util.*;

public class Arrlist {
    static ArrayList l = new ArrayList();
    static Scanner sc = new Scanner(System.in);

    public static void insert(String s)
    {
        l.add(s);
    }

    public static void delete(String s)
    {
        l.remove(s);
    }

    public static void search(String s)
    {
        int i = l.indexOf(s);
        if (i == -1) {
            System.out.println("Element not present.");
        } else {
            System.out.println(s + " is present at " + i);
        }
    }
    public static void dupli()
    {
        for(int i=0;i<l.size();i++)
        {
            if (l.lastIndexOf(l.get(i)) != i) {
                System.out.println(l.get(i) + " is duplicated");
            }
        }

    }

    public static void iter() {
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

    public static void main(String args[]) {
        int n;
        String s, s1;
        do {
            System.out.println("\nEnter operation no. \n 1 - Add \n 2 - Remove \n 3 - Iterate \n 4 - Search \n 5 - Duplicates \n 6 - Exit");
            System.out.println("Enter choice - ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter element/string - ");
                    s = sc.next();
                    insert(s);
                    break;
                case 2:
                    System.out.println("Enter element/string to be removed - ");
                    s = sc.next();
                    delete(s);
                    break;
                case 3:
                    iter();
                    break;
                case 4:
                    System.out.println("Enter element to be searched - ");
                    s = sc.next();
                    search(s);
                    break;
                case 5:
                    dupli();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        } while (n != 6);

    }
}
