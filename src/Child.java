class Parent
{
    public void print1()
    {
        System.out.println("Parent Class.");
    }
}
public class Child extends Parent
{
    public void print2()
    {
        System.out.println("Child Class.");
    }
    public static void main(String args[])
    {
        Parent p = new Parent();
        Child c = new Child();
        p.print1();
        c.print2();
        c.print1();

    }
}
