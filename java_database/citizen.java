package com.dbproj;

import java.sql.*;

import java.util.*;

public class Citizen {

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

//create table citizen(id varchar2(10) PRIMARY KEY, name varchar2(15), age number(10),address varchar2(20),dob date)

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

System.out.println("Enter citizen id: ");

String id = sc.next();

System.out.println("Enter citizen name: ");

String name = sc.next();

System.out.println("Enter Age: ");

int age = sc.nextInt();

System.out.println("Enter Address: ");

String address = sc.next();

System.out.println("Enter Date of birth: ");

String dob = sc.next();

String query1 = String.format("insert into citizen values('%s','%s',%d,'%s','%s')", id,name,age,address,dob);// change here too

stmt.executeUpdate(query1);

System.out.println("Record inserted succesfully ");

System.out.println("Do you want to insert more records[yes/no]");

String option = sc.next();

if(option.equalsIgnoreCase("no")){

break;

}

}

ResultSet rs=stmt.executeQuery("select * from citizen"); // change here too the student

while(rs.next())

System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));

System.out.println("done");

con.close();

}catch(Exception e){ System.out.println(e);}

}

}