import java.io.*;
import java.lang.String;
class vehicle implements Serializable
{
	public String Vname;
	public int id;
	public vehicle(String Vname,int id)
	{
		this.Vname=Vname;
		this.id=id;
	}
	public void disp()
	{
		System.out.println("name :"+Vname);
		System.out.println("id  :"+id);
	}
}
class car extends vehicle
{
	public String comp;
	public car(String Vname,int id,String comp)
	{
		super(Vname,id);
	    this.comp=comp;
	}
	public void disp()
	{
		super.disp();
		System.out.println("comp :"+comp);
	}
}
public class MarISA
{
	public static void main(String arsg[])
	{
	car c=new car("Maruthi",124,"swift");
	try
	{
		FileOutputStream fout=new FileOutputStream("D:\\car.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		fout.writeObject(c);
		fout.close();
		oos.close();
		System.out.println("serialization happend");
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	}
}

