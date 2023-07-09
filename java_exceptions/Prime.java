import java.util.Scanner;
class Prime
{
    static Scanner sc = new Scanner(System.in);
    static void checkPrime(int n) throws PrimeNumberException 
    {
        if (n == 1 || n == 3 || n == 2) 
        {
            throw new PrimeNumberException("The Number is a Prime Number");
        } 
        else if (((n * n) - 1) % 24 == 0) 
        {
            throw new PrimeNumberException("The Number is a Prime Number");
        } 
        else 
        {
            System.out.println("The Number is not a Prime Number");
        }
    }

    public static void main(String[] args) 
    {
        int n, ch;
        try 
        {
            n = sc.nextInt();
            checkPrime(n);
        } catch (PrimeNumberException p) 
        {
            System.out.println("Error: " + p.getMessage());
        } catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}