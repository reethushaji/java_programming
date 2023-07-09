import java.util.Scanner;
class Str

{
    String s1;
    void display(){
        System.out.println(s1);
    }
    void read(){
        System.out.println("Enter a String");
        Scanner in=new Scanner(System.in);
        s1=in.nextLine();
    }
    boolean compare(String s2)
    {
        return s1.equals(s2);
    }
    void concatenate(String s2)
    {
        System.out.println(s1+s2);  
    }
}
class Stringoperations
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Str obj=new Str();
        int ch=0;
        while(ch!=5)
        {
            System.out.println("1.Enter the string");
            System.out.println("2.Display the string");
            System.out.println("3.Compare");
            System.out.println("4.concatenate");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            ch=in. nextInt();
            switch(ch)
            { 
                case 1: obj.read();
                        break;
                case 2: obj.display();
                        break;
                case 3: System.out.println("Enter a string to compare");
                        String s2=in.next();
                        System.out.println(obj.compare(s2));
                case 4: System.out.println("Enter a String to concatenate");
                        s2=in.next();
                        obj.concatenate(s2);
                case 5: break;
                default:System.out.println("Invalid choice");
            }
        }
    }
}
