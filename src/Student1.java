import java.util.Scanner;
public class Student1
{
    String name;
    public Student1()
    {
        this.name="Unknown";
    }
    public Student1(String s)
    {
        this.name=s;
    }
    public static void main(String args[])
    {
        Student1 s1= new Student1();
        System.out.println("Name - "+s1.name);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name - ");
        String str=sc.nextLine();
        s1.name=str;
        System.out.println("Name - "+s1.name);
    }
}
