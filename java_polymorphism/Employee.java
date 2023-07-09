
//has-a 
import java.util.Scanner;
class Address 
{
    String city, state, country; 
    int pinCode;

    public Address(String city, String state, String country, int pinCode) 
    {  
        this.city = city;  
        this.state = state;  
        this.country = country;  
        this.pinCode = pinCode;	    
    }  
}
class Employee 
{  
    String name; 
    int empno;
    Address address;
    public Student2(String name, int empno, Address address) 
    {  
        this.name = name;  
		this.empno = empno;  
        this.address=address; 
    }  
    void display()
    {  
        System.out.println("Name: " +name);
        System.out.println("Employee no: " +empno);
        System.out.println("Address:");
        System.out.println(address.city+" "+address.state+" "+address.country+ " " +address.pinCode); 
        System.out.println("\n");
    }  
    public static void main(String[] args) 
    {  
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the name of city");
        String city=in.nextLine();
        System.out.println("Enter the name of state");
        String state=in.nextLine();
        System.out.println("Enter the name of country");
        String country=in.nextLine();
        System.out.println("Enter the pincode");
        int pincode=in.nextInt();
        System.out.println("Enter the name ");
        String name=in.next();
        System.out.println("Enter the rollno");
        int rollNo=in.nextInt();
        Address addres = new Address(city,state,country,pincode);   
        Student2 st1 = new Student2(name,rollNo,addres);  
        st1.display();  
    }  
}