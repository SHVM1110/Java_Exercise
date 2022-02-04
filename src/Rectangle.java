import java.util.Scanner;
public class Rectangle
{
    public void area(float l,float w)
    {
        float a=l*w;
        System.out.println("Area of Rectangle - "+a);
    }
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of Rectangle - ");
        float l=sc.nextFloat();
        System.out.println("Enter width of Rectangle - ");
        float w=sc.nextFloat();
        r.area(l,w);
    }
}
