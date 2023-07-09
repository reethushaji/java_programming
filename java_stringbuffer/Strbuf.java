package dbpack;

public class Strbuf
{
	public static void main(String[] args)
 	{
 		StringBuffer sb=new StringBuffer("Woods");
 		StringBuffer sb1=new StringBuffer("are");
		StringBuffer sb2=new StringBuffer("lovely");
 		StringBuffer sb3=new StringBuffer("dark");
 		sb.append("deep");
 		int l=sb.length();
 		sb.insert(1,"the");
 		sb1.replace(1,2,"but");
 		sb2.delete(1,2);
 
	 	System.out.println("after append "+ sb);
 		System.out.println("Length "+ l);
 		System.out.println("after insert "+ sb);
	 	System.out.println("after replace "+ sb1);
 		System.out.println("after delete "+ sb2);
 		System.out.println("capacity "+ sb2.capacity());
 		System.out.println("reverse "+ sb3.reverse());
 	}
}
