import java.io.*;  
import java.net.*;  
import java.util.*;
public class Client {  
public static void main(String[] args) {  
try
{
		Socket s=new Socket("localhost",8888);  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message required to sent");
		String sr = sc.next();
		dout.writeUTF(sr);
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String  str=(String)dis.readUTF(); 
		dout.writeUTF(str);
		dout.flush();  
		dout.close();  
		s.close();  
}
catch(Exception e)
{
		System.out.println(e);
}  
}  
}  
