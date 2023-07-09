import java.util.Scanner;
class Teach
{
    String name;
    String dept;
    void enterdata()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Teacher name:");
        name=in.nextLine();
        System.out.println("Department of teacher:");
        dept=in.nextLine();
    }
    void displaydata()
    {
        System.out.println("Teacher name: "+name);
        System.out.println("Teacher department: "+dept);
    }
}
class Student extends Teach
{
	 void enterdata()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Student name:");
        name=in.nextLine();
        System.out.println("Enter student department:");
        dept=in.nextLine();
    }
    void displaydata()
    {
        System.out.println("Student name: "+name);
        System.out.println("The department of student: "+dept);
    }   
}
public class teachandstud
{
    public static void main(String[] args)
    {
        int ch=0;
        Scanner in=new Scanner(System.in);
        Teach t=new Teach();
	    Teach t1=new Student();
        while(ch!=5)
        {
            System.out.println("1.Enter Teacher details");
            System.out.println("2.Enter Student details");
            System.out.println("3.Display Teacher details");
            System.out.println("4.Display Student details");
            System.out.println("5.Exit");
            System.out.println("Enter the Your option");
            ch=in.nextInt();
            switch(ch)
            {
    	        case 1:t.displaydata();
                        break;
                case 2:t1.enterdata();
                        break;
                case 3:t.displaydata();
                        break;
	            case 4:t1.displaydata();
                        break;
                case 5:break;
                default:System.out.println("Wrong choice");
            }       
        }
    }
}
