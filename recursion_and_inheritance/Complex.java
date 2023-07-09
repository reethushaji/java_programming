import java.util.Scanner;
class Complex 
{
	int r, i;
    Complex()
    {
    }
	Complex(int tempR, int tempI)
	{
		r = tempR;
		i = tempI;
	}
	Complex addComp(Complex C1, Complex C2)
	{
		Complex temp = new Complex();
		temp.r = C1.r + C2.r;
		temp.i = C1.i + C2.i;
		return temp;
	}
	Complex subtractComp(Complex C1, Complex C2)
	{
		Complex temp = new Complex();
		temp.r = C1.r - C2.r;
		temp.i = C1.i - C2.i;
		return temp;
	}
    Complex Multiplication(Complex C1,Complex C2)
    {
        Complex temp=new Complex();
        temp.r=(C1.r*C2.r)-(C1.i*C2.i);
        temp.i=(C1.r*C2.i)+(C1.i*C2.r);
        return temp;
    }
	void printComplexNumber()
	{
		System.out.println("Complex number: "+ r + " + "+ i + "i");
	}
    public static void main(String[] args)
	{
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the real part");
        int a=in.nextInt();
        System.out.println("Enter the imaginary part");
        int b=in.nextInt();
        Complex C1 = new Complex(a,b);
		C1.printComplexNumber();
        System.out.println("Enter the real part");
        int c=in.nextInt();
        System.out.println("Enter the imaginary part");
        int d=in.nextInt();
		Complex C2 = new Complex(c,d);
		C2.printComplexNumber();
		Complex C3 = new Complex();
		C3 = C3.addComp(C1, C2);
		System.out.print("Sum of ");
		C3.printComplexNumber();
		C3 = C3.subtractComp(C1, C2);
		System.out.print("Difference of ");
		C3.printComplexNumber();
        C3=C3.Multiplication(C1,C2);
        System.out.print("Multiplication of ");
        C3.printComplexNumber();
	}
}
