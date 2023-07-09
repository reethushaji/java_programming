import java.io.*;
import java.lang.String;
import java.io.*;
class Genericcls<t1,t2>
{
	public void disp(t1 var1,t2 var2)
	{
		System.out.println("the datatype of"+var1+"is :"+var1.getClass());
		System.out.println("the datatype of"+var2+"is :"+var2.getClass());
	}
}
class Genericc
{
	public static void main(String args[])
	{
		System.out.println("Reethu shaji");
		Genericcls<Double,Integer> obj1=new Genericcls<Double,Integer>();
		obj1.disp(1.1,1);
		Genericcls<String,Integer> obj2=new Genericcls<String,Integer>();
		obj2.disp(new String("tommorow is holiday"),1);
	}
}
