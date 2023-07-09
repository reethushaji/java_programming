import java.io.*;
import java.lang.String;
class Employee implements Serializable
{
public String name;
public int age;
public transient int id;
public Employee(String name,int age,int id)
{
this.name=name;
this.age=age;
this.id=id;
}
}
public class ser
{
public static void main(String args[])
{
Employee s =new Employee("Amie",27,568);
try
{
FileOutputStream fout=new FileOutputStream("D:\\Employee.txt");
ObjectOutputStream oos=new ObjectOutputStream(fout);
oos.writeObject(s);
fout.close();
oos.close();
System.out.println("Object has been serialized");

}
catch(IOException e)
{
System.out.println(e);
}
}
}
