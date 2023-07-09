import java.util.*;
import java.lang.*;
import primepackage.prime;
class primeclass 
	{
	public static void main(String args[])
	{
	try
	{ 
	int num=1,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	num=sc.nextInt();
	temp=num;
	primeclass x=new primeclass();
	x.disp(temp);
	}
	catch(Exception e)
	{
	System.out.println("error"+e);
	}
	}
}
