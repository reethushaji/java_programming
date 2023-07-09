import java.io.*;
import java.lang.String;
class Student1 implements Serializable
{
	public String name;
	public String roll;
	public int age;
	public String gender;
	public Student1(String name,String roll,int age,String gender)
	{
		this.name=name;
		this.roll=roll;
		this.age=age;
		this.gender=gender;
	}
}
public class Student
{
	public static void main(String args[])
	{
		try
		{
			Student1 sj=new Student1("Rajagiri","msccs",24,"f");
			FileOutputStream fout=new FileOutputStream("D:\\stud.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			System.out.println("Object student has been serialized");
			oos.writeObject(sj);
			fout.close();
			oos.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
