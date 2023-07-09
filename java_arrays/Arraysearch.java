import java.util.Scanner;
class Arraysearch
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int a=obj.nextInt();
        int ar[]=new int[a];
        System.out.println("Enter "+a+" elements");
        for(int i=0;i<a;i++)
        {
            ar[i]=obj.nextInt();
        }
        System.out.println("Enter the element to search");
        int s=obj.nextInt();
        for(int i=0;i<a;i++)
        {
            if(ar[i]==s)
            {
                System.out.println("Element found at position "+i);
                break;
            }
        }
    }
}