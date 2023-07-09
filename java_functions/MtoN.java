import java.util.Scanner;
class MtoN
{
	public static void main(String[] args)
{
	int i=0;
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter the starting position:");
	int m=scn.nextInt();
	System.out.print("Enter the value of ending position:");
	int n=scn.nextInt();
	System.out.print(m+"\t");
	while(m<n){
	i=m+1;
	System.out.print(i+"\t");
	m++;
	}
}
}
	
	