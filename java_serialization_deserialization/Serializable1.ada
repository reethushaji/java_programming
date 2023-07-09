import java.io.*;
import java.io.Serializable;
class Student implements Serializable
{  int id=100;
 String name="Password";

}
class Serializable1
{ 
public static void main(String args[])throws Exception
{ 
Student s1=new Student();
System.out.println("the stuent id is:"+s1.id);
System.out.println("the student name is:"+s1.name);
FileOutputStream fos=new FileOutputStream("file2.txt",true);
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(s1);
FileInputStream fis=new FileInputStream("file2.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
Student s=(Student)ois.readObject();
System.out.println("the stuent id is:"+s.id);
System.out.println("the student name is:"+s.name);
}
}