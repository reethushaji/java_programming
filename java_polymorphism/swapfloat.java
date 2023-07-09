import java.util.Scanner;
class swapfloat{  
  
  
 void call(float a,float b){  
   System.out.println("First number "+a);  
   System.out.println("Second number "+b);  
     float c;
     c=a;
     a=b;
     b=c;
  
   System.out.println("After swapping: ");
   System.out.println("First number "+a);  
   System.out.println("Second number "+b);  
   } 
     
 public static void main(String args[]){ 
	Scanner in=new Scanner(System.in);
        System.out.println("Enter the first no");
        float a=in.nextFloat();
		 System.out.println("Enter the second no");
        float b=in.nextFloat();
		swapfloat cbv=new swapfloat();  
		cbv.call(a,b);
   
  
 }  
}  