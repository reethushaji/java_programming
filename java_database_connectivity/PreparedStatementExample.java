package com.dbproj;

import java.sql.*;
import java.util.*;
public class PreparedStatementExample {
		// SQL Query
	   private static final String INSERT_STUDENT_QUERY = "INSERT INTO STUDENT5 VALUES (?,?,?,?)";

	   // main method
	   public static void main(String[] args ) {

	     // declare variables
	     Scanner scan = null;
	     int n = 0;
	     int stid= 0;
	     String name = null, address = null, city = null;
	     float avg = 0.0f;
	     String query = null;
	     Connection con = null;
	     PreparedStatement ps = null;
	     int result = 0;

	     try {
	    	 
	    	 Class.forName("oracle.jdbc.driver.OracleDriver"); //load the driver class 
	    	 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","Oracle123");//create  the connection object 
	       
	        scan = new Scanner(System.in);//create Scanner class object
	        
	        // compile SQL query and store it in
	        // PreparedStatement object
	        if(con != null) {
	           ps = con.prepareStatement(INSERT_STUDENT_QUERY);
	        }
	        
	     // take number of students
	        if(scan != null) {
	            System.out.print("Enter Number of students: ");
	            n = scan.nextInt();
	        }
	        
	        
	        if(scan != null && ps != null) {
	           for(int i=0; i<n; i++) {

	              // read input values
	              System.out.println("\nEnter Student-"+(i+1)+" details,");
	              System.out.print("Student ID: ");
	              stid = scan.nextInt();
	              System.out.print("Name: ");
	              name = scan.next();
	              System.out.print("Address: ");
	              address = scan.next();
	              System.out.print("City: ");
	              city = scan.next();

	              // set parameters values
	              ps.setInt(1, stid);
	              ps.setString(2, name);
	              ps.setString(3, address);
	              ps.setString(4, city);

	              // execute the query
	              result = ps.executeUpdate();
	           }
	        }
	        
	        // process the result
	        if(result == 0) {
	           System.out.println("\nRecords insertion failed");
	        } else {
	           System.out.println("\nRecords inserted successfully.");
	        }
	        
	        ResultSet rs=ps.executeQuery("select * from student5");  // change here too the student
	    	while(rs.next())  
	    	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
	    	// update this program with selecting one record / update a record / delete a record etc  
	    	System.out.println("done");
	    		con.close(); 

	     } catch(SQLException se) {
	        se.printStackTrace();
	     } catch(Exception e) {
	        e.printStackTrace();
	     } // try-catch block 

	     finally {
	        // close JDBC objects
	        try {
	           if(ps != null) ps.close();
	        } catch(SQLException se) {
	           se.printStackTrace();
	        }
	        try {
	           if(con != null) con.close();
	        } catch(SQLException se) {
	           se.printStackTrace();
	        }
	        try {
	           if(scan != null) scan.close();
	        } catch(Exception e) {
	           e.printStackTrace();
	        }
	     } // finally
	   } // main()
	} // classx`
	
	