public class Student
{
    String name;
    int roll_no;
    public static void main(String args[])
    {
        Student s = new Student();
        s.name="John";
        s.roll_no=007;
        System.out.println("Name - "+s.name+"\n"+"Roll No. - "+s.roll_no);
    }
}
