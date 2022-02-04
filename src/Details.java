class Member
{
    private String name,addr,phone_no;
    private int age;
    private double sal;
    public Member(String n, int age, String phn, String addr, double sal)
    {
        this.name = n;
        this.age = age;
        this.phone_no = phn;
        this.addr = addr;
        this.sal = sal;
    }
    public void printSalary()
    {
        System.out.println("Salary " + sal);
    }
}
class Employee extends Member
{
    private String spec;
    public Employee(String n, int age, String phn, String addr, double sal,String spec)
    {
        super(n, age, phn, addr, sal);
        this.spec=spec;
    }
}
class Manager extends Member
{
    private String dept;
    public Manager(String n, int age, String phn, String addr, double sal,String dep)
    {
        super(n, age, phn, addr, sal);
        this.dept=dep;
    }
}
public class Details
{
    public static void main(String args[])
    {
        Employee e = new Employee("Tony Stark", 52, "99999", "NYC", 1000000, "STARK INDUSTRIES");
        Manager m= new Manager("Steve Rogers", 100, "99998", "Manhattan", 10000, "CA");
        e.printSalary();
        m.printSalary();
    }
}
