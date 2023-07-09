import java.util.Scanner;

class Distance
{
    int inch,feet;
}
class main
{
public static void  main(String[] args)
{
    Distance obj=new Distance();
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the value for feet");
    obj.feet=in.nextInt();
    System.out.println("Enter the value for inch");
    obj.inch=in.nextInt();
    Distance obj1=new Distance();
    obj1=obj;
    System.out.println("The value in object one are");
    System.out.println(obj.feet+" and "+obj.inch);
    System.err.println(obj1.feet+" and "+obj1.inch);
}
}
