package com.dbproj;

import java.sql.*;

import java.util.*;

public class SQLQueriesExample {

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

//create table student8(no number(10), name varchar2(15), address varchar2(20), city varchar2(20))

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

System.out.println("Enter student number: ");

int stid = sc.nextInt();

System.out.println("Enter student name: ");

String name = sc.next();

System.out.println("Enter Address: ");

String address = sc.next();

System.out.println("Enter City: ");

String city = sc.next();

String query1 = String.format("insert into student9 values(%d,'%s','%s','%s')", stid,name,address,city);// change here too

stmt.executeUpdate(query1);

System.out.println("Record inserted succesfully ");

System.out.println("Do you want to insert more records[yes/no]");

String option = sc.next();

if(option.equalsIgnoreCase("no")){

break;

}

}

ResultSet rs=stmt.executeQuery("select * from student9"); // change here too the student

while(rs.next())

System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));

System.out.println("done");

con.close();

}catch(Exception e){ System.out.println(e);}

}

}