import java.util.Scanner;
class CircleArea
{
    double r,pi;
    CircleArea(double rad, double constan)
    {
	this.r=rad;
	this.pi=constan;
    }
    void area_circle()
    {
        double area=0;
	area=r*r*pi;
        System.out.println("The area of circle is:"+area);
    }
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the radius");
	double rad=sc.nextDouble();
        CircleArea obj=new CircleArea(rad,3.14);
	
        obj.area_circle();
    }
}
