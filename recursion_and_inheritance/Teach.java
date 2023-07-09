import java.util.Scanner;
class Teacher
{
    String name,dept;
    void read_data()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Teacher name:");
        name=in.nextLine();
        System.out.println("Department of teacher:");
        dept=in.nextLine();
    }
    void disp_data()
    {
        System.out.println("Teacher name: "+name);
        System.out.println("Teacher department: "+dept);
    }
}
class Student extends Teacher
{
	 void read_data()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Student name:");
        name=in.nextLine();
        System.out.println("Enter student department:");
        dept=in.nextLine();
    }
    void disp_data()
    {
        System.out.println("Student name: "+name);
        System.out.println("The department of student: "+dept);
    }   
}
class Teach
{
    public static void main(String[] args)
    {
        int ch=0;
        Scanner in=new Scanner(System.in);
        Teacher t=new Teacher();
	    Student t1=new Student();
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
    	        case 1:t.read_data();
                        break;
                case 2:t1.read_data();
                        break;
                case 3:t.disp_data();
                        break;
	            case 4:t1.disp_data();
                        break;
                case 5:break;
                default:System.out.println("Wrong choice");
            }       
        }
    }
}

