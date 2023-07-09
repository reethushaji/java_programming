import java.util.Scanner;
class staticeven
{
    static void printEven(int n)
    {
        for(int i=0;i <=n; i+=2)
        {
            System.out.println(i);
        }
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Enter the Limit ");
        int n=sc.nextInt();
        System.out.println("The numbers are");
        staticeven.printEven(n);
        
    }
}