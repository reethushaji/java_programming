package com.dbproj;

import java.sql.*;

import java.util.*;

public class Login {

public static void main(String args[]){

int result = 0;

String query = null;

try{

//step1 load the driver class

Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create the connection object

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Oracle123");

//step3 create the statement object

Statement stmt=con.createStatement();

Scanner sc = new Scanner(System.in);

if(sc != null)

{

System.out.println("Enter sql query to create table, no semicolon at the end: ");

//create table logintable(uname varchar2(15),upass varchar2(20))

query = sc.nextLine();

}

// execute SQL query

if(stmt != null)

result = stmt.executeUpdate(query);

// process the result

if(result == 0)

System.out.println("Table created");

else

System.out.println("Table not created");

while(true){



System.out.println("Enter user name: ");

String uname = sc.next();


System.out.println("Enter Password: ");

String upass = sc.next();



String query1 = String.format("insert into login values('%s','%s')", uname,upass);// change here too

stmt.executeUpdate(query1);

System.out.println("Record inserted succesfully ");

System.out.println("Do you want to insert more records[yes/no]");

String option = sc.next();

if(option.equalsIgnoreCase("no")){

break;

}

}

ResultSet rs=stmt.executeQuery("select * from login where uname='Bob' and upass='Alice123#' "); // change here too the student

if(rs.next()==true) 

System.out.println("record present"); 

else
System.out.println("not present");

con.close();

}catch(Exception e){ System.out.println(e);}

}

}