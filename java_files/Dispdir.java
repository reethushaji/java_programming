import java.io.File;
import java.util.Scanner;
class Dispdir {
   public static void main(String[] args) throws Exception 
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Path to view the files:");
      File dir = new File(sc.nextLine());
      String[] s1 = dir.list();
      if (s1 == null) {
         System.out.println("does not exist or is not a directory");
      } 
      else {
         for (int i = 0; i < s1.length; i++)  {
            String filename = s1[i];
            System.out.println(filename);
         }
      }
   }
}
