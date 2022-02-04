interface Polygon
{
    void getArea(int length, int breadth);
}
class Rectangle1 implements Polygon
{
    public void getArea(int length, int breadth)
    {
        System.out.println("Area of Rectangle - " + (length * breadth));
    }
}
class Area
{
    public static void main(String[] args)
    {
        Rectangle1 r1 = new Rectangle1();
        r1.getArea(10, 25);
    }
}