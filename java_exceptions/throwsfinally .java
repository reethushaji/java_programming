import java.util.Scanner;
class throwsfinally 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number");
        try
        {
            int n = in.nextInt();
        }catch (Exception e)
        {
            System.out.println("Enter a Valid Number");
        }finally
        {
            System.out.println("exit");
        }
    }
}