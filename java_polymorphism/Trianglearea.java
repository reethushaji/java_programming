import java.util.Scanner;
interface Area{
    void area(int b,int h);
}
class Triangle implements Area
{
    public void area(int b,int h)
    {
        float a=(h*b)/2;
        System.out.println("The area of the triangle is "+a);
    }
}
class Trianglearea
{
    public static void main(String[] args)
    {
    Scanner in=new Scanner(System.in);
    Area obj=new Triangle();
    System.out.println("Enter the breadth");
    int b=in.nextInt();
    System.out.println("Enter the height");
    int h=in.nextInt();
    obj.area(b,h);
    }
}
