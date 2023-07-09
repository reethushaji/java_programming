import java.util.Scanner;
class Palin
{
	int rev=0;
	int rem;
	int temp; 
Palin()
{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=scn.nextInt();
	temp=num;
	while(num>0)
	{
	rem=num%10;
	rev=(rev*10)+rem;
	num=num/10;
	}
	System.out.println("The reverse is:"+rev);
	if(temp==rev){
	System.out.println("The number is palindrome");
	}
	else{
	System.out.println("The number is not a palindrome");
	}
}
	
public static void main(String[] args){
	Palin p=new Palin();
}
	
}
