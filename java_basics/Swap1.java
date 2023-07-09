import java.util.*;
class Swap1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:");
int a=sc.nextInt();
System.out.println("Enter second number:");
int b=sc.nextInt();
int c;
System.out.println("Before swapping a="+a+" b= "+b);
c=a;
a=b;
b=c;
System.out.println("After swapping a="+a+" b= "+b);

}
}

