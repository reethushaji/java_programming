import java.util.Scanner;
class Circle
{
    double r,pi;
    Circle(double x)
    {
        r=x;
        pi=3.14;
    }
    void areacircle()
    {
        double area=0;
        area=pi*r*r;
        System.out.println("The area of circle of radius "+r+" is:"+area);
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r=in.nextDouble();
        Circle obj=new Circle(r);
        obj.areacircle();
    }
}