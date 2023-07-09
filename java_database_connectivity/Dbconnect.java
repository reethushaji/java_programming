
package com.dbproj;

import java.sql.*;

public class Dbconnect {

public static void main(String args[]){

try{

//step1 load the driver class

Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create the connection object

java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Oracle123");

//step3 create the statement object

Statement stmt=con.createStatement();

//step4 execute query

ResultSet rs=stmt.execut eQuery("select * from stud");

while(rs.next())

System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));

System.out.println("done");

//step5 close the connection object

con.close();

}catch(Exception e){ System.out.println(e);}

}

}