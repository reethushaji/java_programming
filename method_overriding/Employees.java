import java.util.Scanner;
class Employees
{
    int eno,esal;
    String ename;
    void read()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the eno");
        eno=in.nextInt();
        System.out.println("Enter the name");
        ename=in.next();
        System.out.println("Enter the esal");
        esal=in.nextInt();
    }
    void display()
    {
        System.out.println("The eno is: "+eno);
        System.out.println("The name is: "+ename);
        System.out.println("The esal is: "+esal);
    }
    public static void main(String[] args)
    {
        Scanner in1=new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n=in1.nextInt();
        Employees[] e = new Employees[n];
        for(int i=0;i<n;i++)
        {
            e[i]= new Employees();
            e[i].read();
        }
        for(int i=0;i<n;i++)
        {
            e[i].display();
        }
        int ch=0;
        while(ch!=3)
        {
            System.out.println("1.Display all Employees");
            System.out.println("2.search Employees");
            System.out.println("3.Exit");
            System.out.println("Enter your option");
            ch=in1.nextInt();
            switch(ch)
            {
                case 1:for(int i=0;i<n;i++)
                        {
                            e[i].display();
                        }
                        break;
                case 2: System.out.println("Enter the eno number");
                        int number=in1.nextInt();
                        for(int i=0;i<n;i++)
                        {
                            if(e[i].eno==number)
                            {
                                e[i].display();
                            }
                        }
                        break;
                default:System.out.println("Wrong option");
            }
        }
    }    
}