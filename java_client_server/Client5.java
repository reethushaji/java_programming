import java.util.*;
import java.net.*;
import java.io.*;
class Client5
{
	public static void main(String[] args)
	{
		String msge;
		try
		{
			Scanner sc=new Scanner(System.in);
			Socket s=new Socket("localhost", 6666);
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			DataInputStream dis=new DataInputStream(s.getInputStream());
			while(true)
			{
				System.out.print("Type the message : ");
				msge=sc.next();
				dos.writeUTF(msge);
				if(msge=="bye")
					break;
				else
				{
					String str=(String)dis.readUTF();
					System.out.println(str);
				}
				
			}
			dos.close();			
			dis.close();
		}
		catch(IOException e)
		{
		}
	}
}