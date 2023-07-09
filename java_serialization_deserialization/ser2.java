import java.io.*;
import java.lang.String;
public class ser2
{
	public static void main(String args[])
	{
		Employee s=null;
		try
		{
			FileInputStream fin=new FileInputStream("D:\\Employee.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
			s=(Employee)oin.readObject();
			System.out.println("name :"+s.name);
			System.out.println("age :"+s.age);
			System.out.println("id :"+s.id);
			fin.close();
			oin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
	}
}
