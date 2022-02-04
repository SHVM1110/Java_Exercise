public class Except
{
    public static void Arith(int n)
    {
        int a=n/0;

    }
    public static void Nullp()
    {
        String s=null;
        System.out.println(s.length());
    }
    public static void Arr()
    {
        int a[]=new int [5];
        a[6]=678;
        System.out.println(a[6]);
    }
    public static void Numb()
    {
        int n = Integer.parseInt(null);
    }
    public static void main(String args[])
    {
        try
        {
            Arith(5);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception handled.");

        }
        try
        {
            Nullp();
        }
        catch (NullPointerException e)
        {
            System.out.println("NullPointer Exception handled.");
        }
        try
        {
            Arr();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception handled.");
        }
        try
        {
            Numb();
        }
        catch (NumberFormatException e)
        {
            System.out.println("NumberFormat Exception handled.");
        }
        finally
        {
            System.out.println("All Exceptions are handled.");
        }

    }
}
