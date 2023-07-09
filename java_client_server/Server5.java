import java.util.*;
import java.net.*;
import java.io.*;
class tcpserver
{
public static void main(String[] args)
{
String msge;

{
Scanner sc=new Scanner(System.in);
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();
DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
while(true)
{
String str=(String)dis.readUTF();
System.out.println(str);
if(str.equalsIgnoreCase("bye"))
{
break;
}
else
{
System.out.print("Type the message : ");
msge=sc.next();
dos.writeUTF(msge);
}
}
			
}
		
}
}