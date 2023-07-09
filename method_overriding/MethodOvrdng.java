class Record
{ 
	
	String tnm="Margret";
	String newtnm="Sunu";
	String snm="ann";
	String newsnm="Baby";
	int rno=20;
	int tno=10;
	int newtno=30;
	int newsno=11;
  void student() 
  { 
    System.out.println("student name:"+snm); 
   System.out.println("student id:"+rno); 
  } 

   void teacher() // Overridden method. 
   { 
     System.out.println("teacher name:"+tnm); 
   System.out.println("teacher id:"+tno); 
  } 
   
}
class Change extends Record 
{ 

   void teacher()  // Overriding method. 
   { 
      System.out.println("New teacher name:"+newtnm); 
	  System.out.println("New teacher id:"+newtno); 
    } 
	void student()
	{
	  System.out.println("New student name:"+newsnm); 
	  System.out.println("New teacher id:"+newsno); 
 } 
}
public class MethodOvrdng
{ 
  public static void main(String[] args) 
  { 
     Change obj = new Change(); 
	 Record obj1 = new Record(); 
	  
      obj.student(); 
	  obj.teacher();
	  obj1.student();
      obj1.teacher(); 
	  
   } 
 }
 
