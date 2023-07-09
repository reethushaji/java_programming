public class Change
{ 
    Change()
    { 
      System.out.println("Hello"); 
    } 
    Change(String a)
    { 
       System.out.println(a); 
    } 
    Change(String a, String b)
    { 
       System.out.println(a+b); 
    }
public static void main(String[] args) 
{ 
    Change c = new Change(); 
         c = new Change("Hi"); 
         c = new Change("Good","morning"); 
   } 
}
