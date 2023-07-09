import java.util.Scanner;
class Strings 
{
    String value; 
    Scanner in=new Scanner(System.in);   
    Strings(String v1)
    {
        value=v1;
    }
    void length()
    {
        System.out.println("The length is "+value.length());
    }
    void compare(String s1)
    {
        System.out.println(value.equals(s1));
    }
    void subsring()
    {
        int start,end;
        System.out.println("Enter the strating index");
        start=in.nextInt();
        System.out.println("The substrings is "+value.substring(start));
        System.out.println("Enter the strating and ending index");
        start=in.nextInt();
        end=in.nextInt();
        System.out.println("The substrings starting from "+start+" to "+end+" is "+value.substring(start,end));
    }
    void convert()
    {
        System.out.println("The upper case is "+value.toUpperCase());
        System.err.println("The lower case is "+value.toLowerCase());
    }
}
class mainstring
{
    public static void main(String[] arsg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.next();
        Strings obj=new Strings(s1);
        int ch=0;
        while(ch!=5)
        {
        System.out.println("1.Length of the String");
        System.err.println("2.Compare");
        System.err.println("3.Extract a substring");
        System.err.println("4.converting case");
        System.err.println("5.Exit");
        System.out.println("Enter your option");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: obj.length();
                    break;
            case 2: System.out.println("Enter a String to compare");
                    String s2=sc.next();
                     obj.compare(s2);
                     break;
            case 3: obj.subsring();
                    break;
            case 4: obj.convert();
                    break;
            case 5: break;
            default:System.out.println("Wrong option");
        }
        }
    }
}