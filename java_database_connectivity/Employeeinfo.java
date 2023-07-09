package com.dbproj;

import java.sql.*;

public class Employeeinfo {

public static void main(String args[]){


try{

//step1 load the driver class

Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create the connection object

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Oracle123");

//step3 create the statement object

Statement stmt1=con.createStatement();




String sql1="create table department2"+ "(dno Number(10) PRIMARY KEY,"+"dname varchar2(15),"+"dloc varchar2(15))";

String sql2="create table emp2"+"(eno number(10) PRIMARY KEY,"+"ename varchar2(15),"+"esal number,"+"dno number references Department(dno))";

stmt1.executeUpdate(sql1);
stmt1.executeUpdate(sql2);
System.out.println("Table 1 created");
System.out.println("Table 2 created");
con.close();

}catch(Exception e){ System.out.println(e);}
}}
