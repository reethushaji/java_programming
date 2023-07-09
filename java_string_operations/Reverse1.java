import java.util.Scanner;
class Stringss
{
    String s1;
    Stringss(String value)
    {
        s1=value;
    }
    void display()
    {
        System.out.println("The string is "+s1);
    }
    void revdisplay()
    {
        String revstr="";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            revstr=ch+revstr;
        }      
        System.out.println("The reverse "+revstr);
    }
}
class Reverse1
{
    public static void main(String[] args)
    {
            Scanner in=new Scanner(System.in);
            System.out.print("Enter the string: ");
            String str=in.next();
            Stringss obj=new Stringss(str);
            obj.display();
            obj.revdisplay();
    }
}
