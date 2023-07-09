import java.util.Scanner;
class Trycatcharray
{
    public static void  main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit of the array");
        int x=in.nextInt();
        int array[]=new int[x];
        System.out.println("Enter the elements to array");
        for(int i=0;i<x;i++)
        {
            try
            {
                array[i]=in.nextInt();
            }catch(NumberFormatException n)
            {
                System.out.println("Enter a valid number");
            }catch(Exception e)
            {
                System.out.println("Enter a valid number");  
            }
        }
    }
}