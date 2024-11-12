public class MO
{
    public int calculateArea(int side)
    {
        return side*side;
    }
    public int calculateArea(int length,int breadth)
    {
        return length*breadth;
    }
    public double calculateArea(double radius)
    {
        return Math.PI*radius*radius;
    }
public static void main(String [] args)
{
   MO mo =new MO();
   int square=mo.calculateArea(8);
   System.out.println("Area of Square "+square);
   int rectangle=mo.calculateArea(4,6);
   System.out.println("Area of Rectangle "+rectangle);
   double circle=mo.calculateArea(6.4);
   System.out.println("Area of Circle "+circle);
}
}