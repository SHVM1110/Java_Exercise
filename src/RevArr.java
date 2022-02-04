import java.util.Scanner;
public class RevArr
{
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
    }
    public static void show(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void Rev(int a[],int b[],int n)
    {
        int j=0;
        for(int i=n-1;i>=0;i--)
        {
            b[i]=a[j];
            j++;
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter size of Array: ");
        int n=sc.nextInt();
        System.out.println("Enter elements of Array: ");
        int a[]=new int [n];
        int b[]=new int [n];
        input(a,n);
        System.out.println("Elements of Array: ");
        show(a,n);
        System.out.println("\nRevere Array: ");
        Rev(a,b,n);
        show(b,n);



    }
}
