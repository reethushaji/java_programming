package prime;

import java.util.Scanner;

class mainss
{
    public static void main(String[] args)
    {
        primefact p =new primefact();
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        p.factor(num);
    }
}