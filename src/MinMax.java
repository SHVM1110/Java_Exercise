import java.util.Scanner;
public class MinMax
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
    public static void Min(int a[],int n)
    {
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]<min)
                {
                    min=a[i];
                }
            }
        }
        System.out.print("\nMinimum Element of Array - "+min);
    }
    public static void Max(int a[],int n)
    {
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]>max)
                {
                    max=a[i];
                }
            }
        }
        System.out.print("\nMaximum Element of Array - "+max);
    }
    public static void main(String args[])
    {
        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of Array: ");
        int a[] = new int[n];
        input(a,n);
        System.out.println("Elements of Array: ");
        show(a,n);
        Min(a,n);
        Max(a,n);

    }
}
