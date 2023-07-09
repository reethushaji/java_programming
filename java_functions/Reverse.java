import java.util.Scanner;
class Reverse 
{
    void Rev(int n)
    {
        int temp,d,rev;
        temp=n;
        rev=0;
        while(temp !=0)
        {
            d=temp%10;
            rev=(rev*10)+d;
            temp=temp/10;
        }
        System.out.println("The reverse of "+n+" is="+rev);
    }
    public static void main(String[] args)
    {
        Reverse obj=new Reverse();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        obj.Rev(n);
    }
}