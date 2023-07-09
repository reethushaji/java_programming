import java.util.Scanner;
class Maximum {
   public static void main(String[] args) {

      System.out.println("Enter three integers ");
      Scanner in = new Scanner(System.in);
 
      int x = in.nextInt();
      int y = in.nextInt();
      int z = in.nextInt();
 
      if ( x > y && x > z )
         System.out.println(x +"  is largest.");
      else if ( y > x && y > z )
         System.out.println(y+"  is largest.");
      else if ( z > x && z > y )
         System.out.println(z+"  is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}