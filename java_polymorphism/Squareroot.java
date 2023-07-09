import java.util.Scanner;
import java.lang.Math;
class Squareroot
{
	double x;
	double sqr(Squareroot obj)
	{
			double s=Math.sqrt(x);
			return s;
	}
	public static void main(String args[])
	{
			Scanner br=new Scanner(System.in);
			Squareroot obj=new Squareroot();
			System.out.println("Enter a number:");
		 	obj.x=br.nextInt();
			System.out.println("Square root of "+obj.x+" is: "+ obj.sqr(obj));
	}
}
