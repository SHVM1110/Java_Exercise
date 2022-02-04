interface A
{
    void method1();
}
interface B
{
    void method2();
}
class C implements A,B
{
    public void method1()
    {
        System.out.println("Interface 1 inherited");
    }
    public void method2()
    {
        System.out.println("Interface 2 inherited");
    }
}
public class Multiple
{
    public static void main(String args[])
    {
        C c = new C();
        c.method1();
        c.method2();
        System.out.println("Multiple inheritance achieved");
    }
}