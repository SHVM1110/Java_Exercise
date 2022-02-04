abstract class A1
{
    void message(){}
}
class C1 extends A1
{
    void message()
    {
        System.out.println("This is First subclass.");
    }
}
class C2 extends A1
{
    void message()
    {
        System.out.println("This is Second subclass.");
    }
}
public class InterfaceExerc
{
    public static void main(String args[])
    {
        C1 c1 = new C1();
        C2 c2 = new C2();
        c1.message();
        c2.message();

    }

}