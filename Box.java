public class Box
{
    private static int boxcount=0;
    private double width;
    private double height;
    private double depth;
    public Box(double width,double height,double depth)
    {
        this.width=width;
        this.height=height;
        this.depth=depth;
        boxcount++;
    }
    public static int getboxcount()
    {
        return boxcount;
    }
    public double vol()
    {
        return width*height*depth;
    }
    public static void main(String [] args)
    {
        Box box1=new Box(2,3,4);
        Box box2=new Box(5,6,7);
        System.out.println("Volume of Box 1: "+box1.vol());
        System.out.println("Volume of Box 2: "+box2.vol());
    }
}