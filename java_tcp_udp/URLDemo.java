package db_package;

import java.net.*;

public class URLDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			URL u=new URL("https://www.amazon.com");
			System.out.println("URL: "+u.toString());
			System.out.println("Protocol: "+u.getProtocol());
			System.out.println("File Name: "+u.getFile());
			System.out.println("Host: "+u.getHost());
			System.out.println("Path: "+u.getPath());
			System.out.println("Port Number: "+u.getPort());
			System.out.println("Query: "+u.getQuery());	
		}
		catch (Exception e) { System.out.println(e); }
	}

}
