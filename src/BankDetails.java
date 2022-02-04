abstract class Bank
{
    public abstract void getBalance();
}
class BankA extends Bank
{
    @Override
    public void getBalance()
    {
        System.out.println("Deposited: $100 ");
    }
}
class BankB extends Bank
{
    @Override
    public void getBalance()
    {
        System.out.println("Deposited: $150 ");
    }
}
class BankC extends Bank
{
    @Override
    public void getBalance()
    {
        System.out.println("Deposited: $200 ");
    }
}
public class BankDetails
{
    public static void main(String args[])
    {
        BankA bA = new BankA();
        BankB bB = new BankB();
        BankC bC = new BankC();
        bA.getBalance();
        bB.getBalance();
        bC.getBalance();
    }
}
