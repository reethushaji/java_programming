import java.io.*;  
import java.net.*;  
public class Server {  
public static void main(String[] args){  
try
{	
	ServerSocket ss=new ServerSocket(8888);  
	Socket s=ss.accept();  
	DataInputStream dis=new DataInputStream(s.getInputStream());  
	String  sr=(String)dis.readUTF();
	DataOutputStream dout = new DataOutputStream(s.getOutputStream());
	dout.writeUTF("Message Recieved");
	System.out.println(sr);  
	ss.close();  
}
catch(Exception e)
{
	System.out.println(e);
}  
}  
}  