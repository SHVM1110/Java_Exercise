import java.util.*;
import java.lang.*;
public class Pattern
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter N - ");

        int n = scanner.nextInt(),i=1;
        double j=1;

        System.out.println("## Pattern ##");

        // Print i number of stars
        for (i=1; i<=n; i++)
        {
            while(j>0)
            {
                System.out.print("*");
                j--;
            }
            j=Math.pow(2,i);
            System.out.println();
        }
    }
}
