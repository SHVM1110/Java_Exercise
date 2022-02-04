import java.util.Scanner;
interface Student2
{
    int studentID = 6138;
    String studentName = "SHIVAM";
    String Class = "CSE (AI&ML)" ;
    void getValue();
}
class Department implements Student2
{
    int attendance;
    public void getAttendance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Attendance: ");
        attendance = sc.nextInt();
    }
    public void getValue()
    {
        System.out.println("UID :" + studentID + "\tName :" + studentName + "\tClass : " + Class);
    }
}
class Exam extends Department
{
    public void calculateAttendance()
    {
        attendance = attendance;
    }
    public boolean eligible()
    {
        if(attendance < 75)
            return false;
        else
            return true;
    }
}
public class Check
{
    public static void main(String[] args)
    {
        Exam e = new Exam();
        e.getValue();
        e.getAttendance();
        e.calculateAttendance();
        System.out.println("Eligibility :" + e.eligible());
    }
}