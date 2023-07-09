import java.util.Scanner;
interface Shape 
{
    public void disp();
    public void calc();
}
class Circle implements Shape 
{
    int radius;
    Circle(int radius)  
    {
        this.radius = radius;
    }
    public void disp() 
    {
        System.out.println("Shape is Circle");
    }
    public void calc() 
    {
        double area = 3.14*radius*radius;
        System.out.println("The area of the Circle with radius " + radius + " is " + area);
    }
}
class Rectangle implements Shape 
{
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
    public void disp() 
    {
        System.out.println("Shape is Rectangle");
    }

    public void calc() 
    {
        double area = l * b;
        System.out.println("The area of the rectangle with l=" + l + " and b=" + b + " is " + area);
    }
}
class Area
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Shape sh=null;
        int ch=0;
        while(ch!=3)
        {
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your Choice: ");
            ch = sc.nextInt();
            switch (ch) 
            {   
                case 1:
                    System.out.print("Enter the radius of the Circle: ");
                    sh = new Circle(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter the length and breath of the Rectangle: ");
                    sh = new Rectangle(sc.nextInt(),sc.nextInt());
                case 3: break;
                default:System.out.println("Enter a Valid Choice...");
            }
            if(sh != null)
            {
                sh.calc();
            }
            else
            {
                System.out.println("Invalid entry");
            }
        }
    }
}
