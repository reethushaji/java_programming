import java.util.Scanner;
class no
{
    void swap(float a,float b)
    {
  	 float c=a;
	    a=b;
    	b=c;
		System.out.println("Values after swaping : a= "+a+" b= "+b);
	}
}
class Floatswap
{
	public static void main(String args[])
    {
		no n=new no();
		float a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two decimal numbers:");
		a=in.nextFloat();
		b=in.nextFloat();
		System.out.println("Values before swapping : a= "+a+" b= "+b);
		n.swap(a,b);
	}
}
